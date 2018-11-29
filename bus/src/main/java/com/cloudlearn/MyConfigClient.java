package com.cloudlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过这个config-client，添加上bus跟activemq依赖
 */
@SpringBootApplication
@RefreshScope
@RestController
public class MyConfigClient {

    public static void main(String args[]){
        SpringApplication.run(MyConfigClient.class);
    }

    @Value("${jdbc}")
    private String jdbc;

    @GetMapping("/test")
    public String test(){
        return jdbc;
    }
}
