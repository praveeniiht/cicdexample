package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
	}
	
	
	@GetMapping("/hello")
	public String test1() {
		return "Hello, Welcome to the RestController Docker demo";
	}
	

	@GetMapping("/bye")
	public String test2() {
		return "Hello, Welcome to the RestController Docker demo";
	}
	
}
