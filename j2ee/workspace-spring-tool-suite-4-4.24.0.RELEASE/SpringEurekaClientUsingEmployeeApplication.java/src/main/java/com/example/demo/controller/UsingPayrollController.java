package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsingPayrollController {
	
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/getDataFetchingFromPayroll/{id}")
	public String getDataFetchingFromPayroll(@PathVariable int id) {
		System.out.println("Given id is : "+id);
		String strUrl="http://PAYROLL/getData/"+id;
		String str=restTemplate.getForObject(strUrl, String.class);
		return str;
	}
}
