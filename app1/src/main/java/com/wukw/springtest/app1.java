package com.wukw.springtest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaClient
@EnableTurbine
public class app1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(app1.class).web(true).run(args);
    }


}
