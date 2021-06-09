package com.birds.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
/**
 * @Description 服务注册中心
 *
 * @Author liu.gx
 *
 * @Time 2021/6/4 01:00
 **/
public class EurekaServerApplication {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}