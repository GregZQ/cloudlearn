package com.cloudlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于进行Eureka-Client的启动
 * Created by Jone on 2018-11-24.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MyEurekaClient {

    public static void main(String args[]){
        SpringApplication.run(MyEurekaClient.class);
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
