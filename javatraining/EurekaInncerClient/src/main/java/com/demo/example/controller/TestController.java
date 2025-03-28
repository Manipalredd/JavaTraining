package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/inter/{id}")
	public Object getEmploy(@PathVariable int id) {
		Object employs = restTemplate.getForObject("http://EurekaClientEx/employee/find/" +id, Object.class);
		return employs;
	}
	
	@GetMapping("/db")
	public Object[] showdbEmploy() {
		Object[] employs = restTemplate.getForObject("http://SbEmployCrud/employ/showEmploy", Object[].class);
		return employs;
	}
	
	
	@GetMapping("/inter")
	public Object[] showEmploy() {
		Object[] employs = restTemplate.getForObject("http://EurekaClientEx/employee/findall", Object[].class);
		return employs;
	}

	
}
