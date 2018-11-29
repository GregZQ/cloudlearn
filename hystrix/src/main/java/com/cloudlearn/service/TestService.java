package com.cloudlearn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "myError")
    public String test() {
        return  restTemplate.getForObject("http://EUREKA-CLIENT/test",String.class);
    }

    public String myError(){
        return "sorry";
    }
}
