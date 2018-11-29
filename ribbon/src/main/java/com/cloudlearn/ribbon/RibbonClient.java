package com.cloudlearn.ribbon;

import com.cloudlearn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon是一个负载均衡客户端，
 * 可以很好的控制htt和tcp的一些行为。
 * Feign默认集成了ribbon。
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.cloudlearn.service")
@RestController
public class RibbonClient {

    @Autowired
    private TestService testService;

    public static void main(String args[]){
        SpringApplication.run(RibbonClient.class);
    }
    /*
    * 通过它开启负责均衡
    * */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/feign-test")
    public String test(){
        return testService.test();
    }
}
