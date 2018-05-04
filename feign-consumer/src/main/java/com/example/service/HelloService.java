package com.example.service;


import com.example.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("eureka-client")
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    String test(@RequestParam("name") String name);

    @RequestMapping(value = "/test1" , method = RequestMethod.GET)
    String test1 (@RequestHeader("name") String name, @RequestHeader("city") String city, @RequestHeader("age") Integer age);

    @PostMapping("/test2")
    String test2(@RequestBody User user );
}
