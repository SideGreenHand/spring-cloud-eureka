package com.cloud.example.eurekaproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducer2Application.class, args);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+" this is producer two ";
    }
}

