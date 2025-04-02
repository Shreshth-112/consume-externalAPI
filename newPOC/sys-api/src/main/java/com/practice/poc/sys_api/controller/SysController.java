package com.practice.poc.sys_api.controller;

import com.practice.poc.sys_api.model.Contact;
import com.practice.poc.sys_api.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SysService service;

    @GetMapping
    public String getMessage() {
        return "OK: 200";
    }

    @GetMapping("/viewallcontacts")
    public List<Contact> viewAll(){
        return service.viewAll();
    }

    @PostMapping("/addcontact")
    public Contact saveContact(@RequestBody Contact c){
        return service.saveContact(c);
    }

}
