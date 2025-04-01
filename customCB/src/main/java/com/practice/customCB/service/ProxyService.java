package com.practice.customCB.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProxyService {

    private final RestTemplate restTemplate;

    @Value("${down.service.url}")
    private String downServiceUrl;

    public ProxyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = "customCircuitBreaker", fallbackMethod = "fallback")
    public String callDownService(String contactInfoJson) {
        String url = downServiceUrl + "processInfo";
        return restTemplate.postForObject(url, contactInfoJson, String.class);
    }

    public String fallback(String orderId, Throwable throwable) {
        return "Required service is temporarily unavailable for Order ID: " + orderId;
    }


}
