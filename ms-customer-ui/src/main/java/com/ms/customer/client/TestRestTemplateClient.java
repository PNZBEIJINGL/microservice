package com.ms.customer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class TestRestTemplateClient {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${client.root-uri}")
    private String rootUri;

    public String getVersion(String name) {
        return restTemplate.getForObject("/version?name={name}", String.class, name);
    }

    public String getDate(String name) {
        return restTemplate.getForObject("/date/{name}", String.class, name);
    }

    public String info(String name) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("name", name);
        RequestEntity<String> requestEntity = new RequestEntity<String>(httpHeaders, HttpMethod.GET, URI.create(rootUri + "/company"));
        ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
        return responseEntity.getBody();

    }

}
