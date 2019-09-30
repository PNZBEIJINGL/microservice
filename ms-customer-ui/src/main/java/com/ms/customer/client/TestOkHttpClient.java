package com.ms.customer.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TestOkHttpClient {
    @Autowired
    private OkHttpClient okHttpClient;

    @Value("${client.root-uri}")
    private String rootUri;

    public String getVersion(String name) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url(String.format("%s/version?name=%s", rootUri, name))
                .build();
        Response reponse = okHttpClient.newCall(request).execute();
        return reponse.body().string();
    }

    public String getDate(String name) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url(String.format("%s/date/%s", rootUri, name))
                .build();
        Response reponse = okHttpClient.newCall(request).execute();
        return reponse.body().string();
    }

    public String info(String name) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url(String.format("%s/company", rootUri))
                .addHeader("name", name)
                .build();
        Response reponse = okHttpClient.newCall(request).execute();
        return reponse.body().string();
    }

}


