package com.furkanbrgl.dynwebapp;

import org.junit.Test;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class HttpBasicAuthorizationTest {

    private RestTemplate restTemplate;

    @Test
    public void setUp() {
        restTemplate = new RestTemplate();
        BasicAuthorizationInterceptor basicAuthorizationInterceptor = new BasicAuthorizationInterceptor("user",
                "secret");
        restTemplate.setInterceptors(Arrays.asList(basicAuthorizationInterceptor));
    }
}
