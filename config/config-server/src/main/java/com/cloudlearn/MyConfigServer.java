package com.cloudlearn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
public class MyConfigServer {

    public static void main(String args[]){
        SpringApplication.run(MyConfigServer.class);
    }
}
