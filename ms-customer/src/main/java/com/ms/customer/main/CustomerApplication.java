package com.ms.customer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * CustomerApplication
 * SpringBootApplication默认扫描CustomerApplication所在包所以需要scanBasePackages制定包名
 */
@SpringBootApplication(scanBasePackages = {"com.ms"})
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
