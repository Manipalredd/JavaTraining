package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayhello() {
		return "Hi";
	}
	
	@GetMapping(value="/")
	public String defaultData() {
		return"Welcome to brillio...";
	}
	@GetMapping(value="/greet/{name}")
	public String greeting(@PathVariable String name) {
		return "Good Morning...!" + name;
	}
}
