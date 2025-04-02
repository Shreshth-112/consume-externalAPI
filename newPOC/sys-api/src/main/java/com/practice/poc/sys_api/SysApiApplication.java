package com.practice.poc.sys_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SysApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysApiApplication.class, args);
	}

}
