package com.ms.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer")
    public String getProduct() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        //通过RestTemplate对象发送一个get请求，调用resource服务的RestAPI
        String product = restTemplate.getForObject("http://localhost:8082/product", String.class);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("custId=1");
        stringBuffer.append("|" + product);
        return stringBuffer.toString();
    }




    @RequestMapping("/")
    public String index() {
        return "welcome customer";
    }
}
