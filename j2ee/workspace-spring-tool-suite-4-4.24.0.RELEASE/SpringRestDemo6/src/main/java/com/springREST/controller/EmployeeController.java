package com.springREST.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	//Spring REST
public class EmployeeController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Welcome to Spring REST";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String UID, @RequestParam String PWD) {
		System.out.println("Given data is : UserId :"+UID+" Password :"+PWD);
		
		if(UID.equalsIgnoreCase("user") && PWD.equalsIgnoreCase("admin"))
			return "You are a valid user";
		else
			return "Invalid username or password. Please check your credentials";
	}
}
