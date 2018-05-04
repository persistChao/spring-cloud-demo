package com.example.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;

/**
 * @author answer
 * @description
 * @create 11:33
 **/
@RestController
public class ComputeController {

    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public Integer add( Integer a  , Integer b){
        Integer result = a + b;
        return result;
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hi " + name + ", i am from port" + port;
    }
}
