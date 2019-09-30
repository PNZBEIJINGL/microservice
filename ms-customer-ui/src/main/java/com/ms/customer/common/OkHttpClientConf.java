package com.ms.customer.common;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OkHttpClientConf {

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

}
