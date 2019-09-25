package com.ms.resource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("/resource")
    public String getResurce() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Conax Smart Card";
    }

    @RequestMapping("/")
    public String index() {
        return "welcome resource";
    }
}
