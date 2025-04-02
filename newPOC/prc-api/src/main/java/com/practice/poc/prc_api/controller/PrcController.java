package com.practice.poc.prc_api.controller;

import com.practice.poc.prc_api.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/prc")
public class PrcController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/contacts")
    public List<Contact> getContactInfo() {

        String url = "http://localhost:8083/sys/viewallcontacts";
        ParameterizedTypeReference<List<Contact>> responseType = new ParameterizedTypeReference<List<Contact>>() {
        };
        ResponseEntity<List<Contact>> response = restTemplate.exchange(
                url, HttpMethod.GET, null, responseType);

        return response.getBody();

    }


}
