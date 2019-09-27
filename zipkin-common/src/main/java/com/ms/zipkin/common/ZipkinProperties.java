package com.ms.zipkin.common;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("zipkin")
public class ZipkinProperties {

    //通过ConfigurationProperties注解读取properties配置中的zipkin配置
    private String endpoint;//端点
    private String service; //服务,用于区分

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
