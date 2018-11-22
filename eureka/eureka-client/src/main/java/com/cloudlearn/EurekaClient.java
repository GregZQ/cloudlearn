package com.cloudlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述:  Eureka-Client
 *
 * @author jone.zhang@marketin.cn
 * @create 2018-11-22 下午6:04
 * @since cloudlearn
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient {

    public static void main(String args[]){
        SpringApplication.run(EurekaClient.class);
    }
}
