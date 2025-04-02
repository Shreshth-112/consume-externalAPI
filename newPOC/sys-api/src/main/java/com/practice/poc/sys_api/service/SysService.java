package com.practice.poc.sys_api.service;

import com.practice.poc.sys_api.model.Contact;
import com.practice.poc.sys_api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysService {

    @Autowired
    private ContactRepository repo;

    public List<Contact> viewAll(){
        return repo.findAll();
    }

    public Contact saveContact(Contact c){
        return repo.save(c);
    }

}
