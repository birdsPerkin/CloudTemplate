package com.birds.eurekaconsumer.controller;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 服务消费实例
 * @Author liu.gx
 * @Time 2021/06/10 01:43
 **/
@Controller
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/getUser")
    @ResponseBody
    public Map<String,String> getUser(){
//        Object user = restTemplate.getForObject("http://eureka-client-service/user",String.class);
        return restTemplate.getForObject("http://eureka-client-service/user", HashMap.class);
    }
}
