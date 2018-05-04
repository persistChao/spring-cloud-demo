package com.example.controller;/**
 * Create by 苏超 on 2017/10/25.<br>
 */

import com.example.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @create 11:11
 **/
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String sayHello(@RequestParam  String name) {
        return schedualServiceHello.sayHelloFromClientOne(name);
    }
}
