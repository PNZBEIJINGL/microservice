package com.ms.customer.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

@Configuration
public class RetrofitConf {

    @Value("${retrofit.base-url}")
    private String baseUrl;

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder().baseUrl(baseUrl).build();
    }
}
