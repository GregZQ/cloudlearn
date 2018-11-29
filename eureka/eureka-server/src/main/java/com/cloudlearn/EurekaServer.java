package com.cloudlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Jone on 2018-11-24.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String args[]){
        SpringApplication.run(EurekaServer.class);
    }
}
