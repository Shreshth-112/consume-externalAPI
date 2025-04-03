package com.practice.poc.exp_api.controller;

import com.practice.poc.exp_api.model.Contact;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exp")
public class ExpController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String exp_api =  "exp-api";

    @GetMapping
    public String getMessage(){
        return "OK: 200";
    }

    @GetMapping("/contacts")
    @CircuitBreaker(name = exp_api, fallbackMethod = "fallbackCallingPrc")
    public List<Contact> getContactInfo() {
        String url = "http://prc-api/prc/contacts";
        ParameterizedTypeReference<List<Contact>> responseType = new ParameterizedTypeReference<List<Contact>>() {
        };
        ResponseEntity<List<Contact>> response = restTemplate.exchange(
                url, HttpMethod.GET, null, responseType);

        return response.getBody();
    }

    public List<Contact> fallbackCallingPrc(Exception appDown){
        List<Contact> fallbackContacts = new ArrayList<>();

        fallbackContacts.add(new Contact(404L, "default@placeHolder.com", "Unknown", "SERVICE_DOWN"));

        return fallbackContacts;

    }
}
