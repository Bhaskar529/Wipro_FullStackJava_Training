package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getData/{id}")
	public String getData(@PathVariable int id) {
		System.out.println("Given id is : "+id);
		if(id==10)
			return "Varun";
		else if (id==11)
			return "Subbu";
		else if (id==12)
			return "Ramesh";
		else
			return "Invalid Employee id";
	}
}
