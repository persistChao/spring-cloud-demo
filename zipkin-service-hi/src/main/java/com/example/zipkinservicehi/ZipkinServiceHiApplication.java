package com.example.zipkinservicehi;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ZipkinServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceHiApplication.class, args);
	}
    private static final Logger log = Logger.getLogger(ZipkinServiceHiApplication.class.getName());


	@Autowired
    private RestTemplate restTemplate;

	@Bean
    public RestTemplate getRestTemplate(){
	    return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        log.log(Level.INFO , "calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8989/miya" , String.class);
    }

    @RequestMapping("/info")
    public String  info() {
        log.log(Level.INFO , "calling trace service-hi");
        return "i'm service-hi";
    }

    @Bean
    public AlwaysSampler defualtSampler() {
        return new AlwaysSampler();
    }
}
