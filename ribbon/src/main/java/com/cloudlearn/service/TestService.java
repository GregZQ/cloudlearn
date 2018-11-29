package com.cloudlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jone on 2018-11-25.
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String test(){
       return  restTemplate.getForObject("http://EUREKA-CLIENT/test",String.class);
    }
}
