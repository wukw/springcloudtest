package com.wukw.springtest.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wukw.springtest.service.StoreIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    StoreIntegration storeIntegration;

    @HystrixCommand(fallbackMethod = "follback")
    @GetMapping("testhys")
    public String testhys () throws InterruptedException {
        return storeIntegration.getStores(null);
    }
    @HystrixCommand(fallbackMethod = "follback")
    @SessionScope
    public String follback () throws InterruptedException {
        return storeIntegration.defaultStores(null);
    }



}
