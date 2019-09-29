package com.ms.customer.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConf {

    /**
     * 通过@Value注解从application.properties中获取配置的信息
     */
    @Value("${client.root-uri}")
    private String rootUrl;
    @Value("${client.connect-timeout}")
    private int connectTimeout;
    @Value("${client.read-timeout}")
    private int readTeimeout;

    /**
     * 创建一个RestTemplate用于实现HTTP调用
     *
     * @param builder
     * @return
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.rootUri(rootUrl).setConnectTimeout(connectTimeout).setReadTimeout(readTeimeout).build();
    }
}
