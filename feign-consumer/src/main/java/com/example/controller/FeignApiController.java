package com.example.controller;

import com.example.entity.User;
import com.example.service.HelloService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;


/**
 * @author answer
 * @description
 * @create 2018/1/17 17:21
 **/
@RestController
@RequestMapping("/common/api")
public class FeignApiController {

    @Autowired
    HelloService2 helloService2;

    @GetMapping("/test")
    public String test(){
        return helloService2.test("苏超");
    }

    @GetMapping("/test1")
    public User test1(){
//        User user = new User();
//        user.setName("苏超");
//        user.setCity("北京");
//        user.setAge(26);
        User user = helloService2.test1(URLEncoder.encode("苏超"),URLEncoder.encode("北京") , 26);
        return user;
    }

    @GetMapping("/test2")
    public String test2(){
        User user = new User();
        user.setName("苏超");
        user.setCity("北京");
        user.setAge(26);
        return helloService2.test2(user);
    }
}
