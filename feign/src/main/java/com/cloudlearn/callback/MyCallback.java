package com.cloudlearn.callback;

import com.cloudlearn.interfaces.MyFeignInterface;
import org.springframework.stereotype.Component;

/**
 * Feign是自带断路器的,用于实现在服务出故障的情况下断路。
 * 防止出现集群下的“雪崩”；
 */
@Component
public class MyCallback implements MyFeignInterface {
    @Override
    public String test() {
        return "sorry,error.";
    }
}
