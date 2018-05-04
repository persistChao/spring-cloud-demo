package com.example.controller;

import com.example.entity.User;
import com.example.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author answer
 * @description
 * @create 2018/1/17 15:14
 **/
@RestController
public class FeigenController {

    private static final Logger logger = LoggerFactory.getLogger(FeigenController.class);

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        logger.debug("invoke feigenController ....");
        return helloService.hello();
    }

    @GetMapping("/test")
    public String test() {
        return helloService.test("suchao");
    }

    @GetMapping("/test1")
    public String test1() {
        return helloService.test1("suchao" , "beijing" , 26);
    }

    @GetMapping("/test2")
    public String test2() {
        User user = new User();
        user.setName("suchao");
        user.setCity("beijing");
        user.setAge(26);
        return helloService.test2(user);
    }

}
