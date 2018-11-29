package com.cloudlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jone on 2018-11-26.
 */
@SpringBootApplication
public class ZipkinServer {


    public static void main(String args[]){
        SpringApplication.run(ZipkinServer.class);
    }
}
