package com.capgemini.poc.receivingAPI.controller;

import com.capgemini.poc.receivingAPI.model.Contacts;
import com.capgemini.poc.receivingAPI.service.ReceiverService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/receive")
public class ReceiverController {

    @Autowired
    private ReceiverService service;

    public static final String USER_SERVICE = "receivingAPI";

    @GetMapping
    public String message() {
        return "OK:200";
    }


    @GetMapping("/viewcontacts")
    @CircuitBreaker(name=USER_SERVICE, fallbackMethod = "fallback")
    public List<Contacts> getAll() {
        return service.findAllContacts();
    }

    public List<Contacts> fallback(Exception receivedException){

        List<Contacts> fallbackContacts = new ArrayList<>();

        fallbackContacts.add(new Contacts("ERROR service down Name", "default@example.com", "Unknown", 1234567890L));

        return fallbackContacts;
    }

}
