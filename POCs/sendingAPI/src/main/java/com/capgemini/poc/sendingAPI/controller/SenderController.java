package com.capgemini.poc.sendingAPI.controller;

import com.capgemini.poc.sendingAPI.model.Contacts;
import com.capgemini.poc.sendingAPI.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class SenderController {

    @Autowired
    private SenderService service;

    @GetMapping
    public String getMessage() {
        return "OK: 200";
    }

    @GetMapping("/viewcontacts")
    public List<Contacts> showProducts() {
        return service.findAll();
    }

    @PostMapping("/addcontact")
    public Contacts createProduct(@RequestBody Contacts contact) {
        return service.saveContacts(contact);
    }
}
