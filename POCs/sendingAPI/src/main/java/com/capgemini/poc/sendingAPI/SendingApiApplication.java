package com.capgemini.poc.sendingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SendingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendingApiApplication.class, args);
	}

}
