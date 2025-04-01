package com.practice.customCB.controller;

import com.practice.customCB.service.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBcontroller {

    @Autowired
    ProxyService proxyService;

    @GetMapping("/callDownService/{orderId}")
    public String callDownService(@PathVariable String orderId) {
        return proxyService.callDownService(orderId);
    }
}
