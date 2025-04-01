package com.capgemini.poc.sendingAPI.service;

import com.capgemini.poc.sendingAPI.model.Contacts;
import com.capgemini.poc.sendingAPI.repository.SenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenderService {

    @Autowired
    private SenderRepo repo;

    public List<Contacts> findAll(){
        return repo.findAll();
    }

    public Contacts saveContacts(Contacts c){
        return repo.save(c);
    }

}
