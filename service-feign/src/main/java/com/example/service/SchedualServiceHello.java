package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by 苏超 on 2017/10/25.<br>
 */

@FeignClient(value = "client-1" , fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
     String sayHelloFromClientOne(@RequestParam(value = "name") String name) ;
}
