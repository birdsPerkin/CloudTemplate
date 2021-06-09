package com.birds.eurekaclientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author liu.gx
 * @Time 2021/06/09 22:51
 **/
@Controller
public class TestController {


    @RequestMapping(value = "/user")
    @ResponseBody
    public Map<String,String> test(String username, String password){
//        logger.info("username: "+username+"password: "+password);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("username","admin");
        hashMap.put("password","password");
        return hashMap;
    }

    @RequestMapping(value = "/getWelcom")
    @ResponseBody
    public String home(String username, String password){
//        logger.info("username: "+username+" -- password: "+password);
        System.out.println("hahahahahahhaha-------");
        System.out.println("hahahahahahhaha-------alallal");
        return "Hello, this is our Template!!!S";
    }
}