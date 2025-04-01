package com.capgemini.poc.receivingAPI.feign;

import com.capgemini.poc.receivingAPI.model.Contacts;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "feignClient", url = "http://localhost:8763/contact")
public interface ContactsFeign {

    @RequestMapping(method= RequestMethod.GET, value="/viewcontacts")
    public List<Contacts> showContacts();
}
