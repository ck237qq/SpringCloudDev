package com.mike.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TokenResquestInterceptor implements RequestInterceptor {
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token", UUID.randomUUID().toString());
    }
}
