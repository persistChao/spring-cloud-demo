package com.example.service;/**
 * Create by 苏超 on 2017/10/24.<br>
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @description
 * @create 16:54
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://CLIENT-1/hello?name=" + name , String.class);
    }

    public String helloError(String name){
        return "hello " + name + ", sorry error！";
    }
}
