package com.cloudlearn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 描述:
 *
 * @author jone.zhang@marketin.cn
 * @create 2018-11-22 下午1:42
 * @since MA - 2.2
 */
@SpringBootApplication
@RestController
@RefreshScope  //加上这个注解用于实现更新配置后自动生效
public class ConfigClient {
    public static void main(String args[]){
        SpringApplication.run(ConfigClient.class);
    }

    @Value("${name}")
    String value;

    @GetMapping("/dev")
    public String test(){
        return value;
    }

}
