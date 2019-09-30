package com.ms.customer.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 只是一个测试类
 */
@RestController
public class TestController {

    /**
     * RequestParam从请求参数中获取指定名称的参数
     *
     * @param name
     * @return
     */
    @GetMapping("/version")
    public String getVersion(@RequestParam("name") String name) {
        return "version: " + "1.0.0" + " | " + name;
    }

    /**
     * PathVariable 从请求路径中获取指定名称的参数
     *
     * @param name
     * @return
     */
    @GetMapping("/date/{name}")
    public String date(@PathVariable("name") String name) {
        return "date: " + new Date() + " | " + name;
    }

    /**
     * 从请求头重获取制定名称的参数
     *
     * @param name
     * @return
     */
    @GetMapping("/company")
    public String company(@RequestHeader("name") String name) {
        return "company: " + "strtimes " + " | " + name;
    }

}
