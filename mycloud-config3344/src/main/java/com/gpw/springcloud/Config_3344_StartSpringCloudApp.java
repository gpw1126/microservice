package com.gpw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Gpw
 * @Date: 2019/6/12
 * @Description: com.gpw.springcloud
 * @Version: 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
