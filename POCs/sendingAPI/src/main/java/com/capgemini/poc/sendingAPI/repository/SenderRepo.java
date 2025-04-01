package com.capgemini.poc.sendingAPI.repository;

import com.capgemini.poc.sendingAPI.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepo extends JpaRepository<Contacts, Long> {

}
