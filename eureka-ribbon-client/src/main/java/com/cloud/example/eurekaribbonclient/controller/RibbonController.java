package com.cloud.example.eurekaribbonclient.controller;

import com.cloud.example.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false,defaultValue = "cc")String name){
        return ribbonService.hello(name);
    }
}
