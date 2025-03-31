package com.practice.restTemplateExample.controller;

import com.practice.restTemplateExample.output.PostOfficeResponseDetails;
import com.practice.restTemplateExample.serviceImpl.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {

    @Autowired
    PostalService postalService;

    @GetMapping(value = "/bycity", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponseDetails getPostalByCity(@RequestParam String city) {

        return postalService.fetchPostOfficeDetailsByCity(city);
    }
}
