package com.springREST.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class salary {
	
	@GetMapping("/salary")
	public String salary(@RequestParam int basic,@RequestParam int hra,@RequestParam int da,
			@RequestParam  int deduction) {
		float grossSalary=basic+hra+da;
		double Deductions=deduction+0.12*basic;
		double totalSalary=grossSalary-Deductions;
		System.out.println("Total salary is : "+totalSalary);
		return "Total salary is : "+totalSalary;
	}
}

