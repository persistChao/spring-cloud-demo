package com.example.service;

import com.example.api.FeigenServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "eureka-client")
public interface HelloService2 extends FeigenServiceApi{
}
