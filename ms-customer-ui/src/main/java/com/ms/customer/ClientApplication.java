package com.ms.customer;

import com.ms.customer.client.TestingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {
    @Autowired
    private TestingClient client;

    public void run(String... strings) throws Exception {
        System.out.println(client.getVersion("param:version"));
        System.out.println(client.getDate("param:date"));
        System.out.println(client.info("param:info"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args).close();
    }
}
