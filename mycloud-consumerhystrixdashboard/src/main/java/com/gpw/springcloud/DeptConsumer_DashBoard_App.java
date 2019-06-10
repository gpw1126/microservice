package com.gpw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: Gpw
 * @Date: 2019/6/8
 * @Description: com.gpw.springcloud
 * @Version: 1.0
 */
@SpringBootApplication

@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
