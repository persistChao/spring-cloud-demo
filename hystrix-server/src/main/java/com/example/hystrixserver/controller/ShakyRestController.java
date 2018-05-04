package com.example.hystrixserver.controller;

import com.example.hystrixserver.service.ShakyBusinessService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author answer
 * @description
 * @create 2017/12/21 16:58
 **/
@RestController
public class ShakyRestController {
    private final ShakyBusinessService shakyBusinessService;

    @Autowired
    public ShakyRestController(ShakyBusinessService shakyBusinessService){
        this.shakyBusinessService=shakyBusinessService;
    }
    @GetMapping(value = "/boom")
    public int boom() throws  Exception{
        return this.shakyBusinessService.desireNumber();
    }


}
