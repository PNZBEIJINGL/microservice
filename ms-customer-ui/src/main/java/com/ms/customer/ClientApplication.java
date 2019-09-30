package com.ms.customer;

import com.ms.customer.client.TestOkHttpClient;
import com.ms.customer.client.TestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

    @Autowired
    private TestTemplateClient templateClient;

    @Autowired
    private TestOkHttpClient okHttpClient;

    @Override
    public void run(String... strings) throws Exception {

        //Spring RestTemplate
        System.out.println("result:" + templateClient.getVersion("RestTemplate Testing"));
        System.out.println("result:" + templateClient.getDate("RestTemplate Testing"));
        System.out.println("result:" + templateClient.info("RestTemplate Testing"));

        //Okhttp
        System.out.println("result:" + okHttpClient.getVersion("okHttpClient Testing"));
        System.out.println("result:" + okHttpClient.getDate("okHttpClient Testing"));
        System.out.println("result:" + okHttpClient.info("okHttpClient Testing"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args).close();
    }
}
