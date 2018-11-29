package com.cloudlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jone on 2018-11-25.
 */
@SpringBootApplication
@RestController
@RefreshScope
public class MyConfigClient {


    public static void main(String args[]){
        SpringApplication.run(MyConfigClient.class);
    }
    @Value("${jdbc}")
    private String value;

    @GetMapping("/test")
    public String test(){
        return value;
    }
}
