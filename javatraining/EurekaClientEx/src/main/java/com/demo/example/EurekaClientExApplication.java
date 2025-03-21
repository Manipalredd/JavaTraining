package com.demo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientExApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientExApplication.class, args);
	}

}
