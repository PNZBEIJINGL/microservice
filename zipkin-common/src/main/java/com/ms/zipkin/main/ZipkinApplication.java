package com.ms.zipkin.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ms.zipkin"})
public class ZipkinApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZipkinApplication.class, args);

    }

}
