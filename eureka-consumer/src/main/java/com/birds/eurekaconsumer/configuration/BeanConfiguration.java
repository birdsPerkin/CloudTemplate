package com.birds.eurekaconsumer.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 配置类
 * @Author liu.gx
 * @Time 2021/06/10 01:38
 **/
@Configuration
public class BeanConfiguration {

    /**
     *
     * @return
     * @LoadBalanced 注解，这个注解会自动构造 LoadBalancerClient 接口的实现类并注册到 Spring 容器中
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
