package com.cloud.example.eurekaribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate template;

    public String hello(String name){
        return template.getForObject("http://spring-cloud-producer/hello?name=" + name, String.class);
    }
}
