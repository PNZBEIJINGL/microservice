package com.ms.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResourceController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/resource")
    public String getResurce() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Conax Smart Card";
    }

    @RequestMapping("/welcome")
    public String index() {
        return "Hello World ,This is index";
    }
}
