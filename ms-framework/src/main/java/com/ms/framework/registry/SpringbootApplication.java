package com.ms.framework.registry;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAdminServer  //启动Spring Boot Admin服务器端扫描，通过http://localhost:8080 查看应用程序主界面
@SpringBootApplication
public class SpringbootApplication {

    @RequestMapping("/welcome")
    public String index() {
        return "Hello World ,This is index";
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);


    }

}
