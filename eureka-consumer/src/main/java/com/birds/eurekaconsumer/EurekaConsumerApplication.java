package com.birds.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        String value = "hello";
        SpringApplication.run(EurekaConsumerApplication.class, args);

    }

}
