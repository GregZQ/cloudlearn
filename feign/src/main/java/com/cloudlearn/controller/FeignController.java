package com.cloudlearn.controller;

import com.cloudlearn.interfaces.MyFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jone on 2018-11-25.
 */
@RestController
public class FeignController {

    @Autowired
    private MyFeignInterface myFeignInterface;

    @GetMapping("/feign-test")
    public String test(){
        return myFeignInterface.test();
    }
}
