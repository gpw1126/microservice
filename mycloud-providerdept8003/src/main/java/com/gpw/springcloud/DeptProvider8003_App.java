package com.gpw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
