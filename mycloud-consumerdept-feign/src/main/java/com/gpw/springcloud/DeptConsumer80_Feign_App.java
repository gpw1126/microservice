package com.gpw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gpw.springcloud"})
@ComponentScan("com.gpw.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
