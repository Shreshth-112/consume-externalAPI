package com.capgemini.poc.receivingAPI.controller;

import com.capgemini.poc.receivingAPI.model.Contacts;
import com.capgemini.poc.receivingAPI.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receive")
public class ReceiverController {

    @Autowired
    private ReceiverService service;

    @GetMapping
    public String message() {
        return "OK:200";
    }


    @GetMapping("/viewcontacts")
    public List<Contacts> getAll() {
        return service.findAllContacts();
    }

}
