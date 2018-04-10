package com.wukw.springtest.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StoreIntegration {

    public String getStores(Map<String, Object> parameters) {
        int  i = 100/0;
        return "aaaaaaa";
    }

    public String defaultStores(Map<String, Object> parameters) throws InterruptedException {
        System.out.println("执行熔断");
        return "bbbbb";

    }
}
