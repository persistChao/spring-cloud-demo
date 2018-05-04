package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author answer
 * @description
 * @create 2018/1/19 11:55
 **/
@RestController
public class GateWayController {

    @GetMapping("/gateway")
    public String gateWay() {
        return "hello i'm gateway...";
    }
}
