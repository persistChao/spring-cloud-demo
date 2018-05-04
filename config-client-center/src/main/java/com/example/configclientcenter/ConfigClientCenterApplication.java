package com.example.configclientcenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class ConfigClientCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientCenterApplication.class, args);
	}


	@Value("${info.from}")
    String info;
	@RequestMapping("/testConfigCenter")
    public String printProperties () {
        return "从配置中心获取的 info信息为："  + info;
    }
}
