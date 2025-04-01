package com.capgemini.poc.receivingAPI.service;

import com.capgemini.poc.receivingAPI.feign.ContactsFeign;
import com.capgemini.poc.receivingAPI.model.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiverService {

    @Autowired
    private ContactsFeign client;

    public List<Contacts> findAllContacts(){
        return client.showContacts();
    }

}
