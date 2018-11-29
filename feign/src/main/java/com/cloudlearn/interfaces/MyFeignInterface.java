package com.cloudlearn.interfaces;

import com.cloudlearn.callback.MyCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 声明接口，通过注解指明要调用的服务
 */
@FeignClient(value = "eureka-client",fallback = MyCallback.class)
public interface MyFeignInterface {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
