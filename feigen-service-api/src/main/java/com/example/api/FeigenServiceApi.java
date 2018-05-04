package com.example.api;

import com.example.entity.User;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/hs2")
public interface FeigenServiceApi {

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    String test(@RequestParam("name") String name);
    
    @RequestMapping(value = "/test1" , method = RequestMethod.GET)
    User test1 (@RequestHeader("name") String name, @RequestHeader("city") String city, @RequestHeader("age") Integer age);

    @PostMapping("/test2")
    String test2(@RequestBody User user );
}
