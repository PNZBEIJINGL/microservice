package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/product")
    public String getProduct() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //通过RestTemplate对象发送一个get请求，调用resource服务的RestAPI
        String resource = restTemplate.getForObject("http://localhost:8083/resource", String.class);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PRODUCTID=1");
        stringBuffer.append("|" + resource);
        return stringBuffer.toString();
    }


    @RequestMapping("/")
    public String index() {
        return "welcome product";
    }
}
