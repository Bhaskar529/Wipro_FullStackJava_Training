package com.springREST.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springREST.data.Student;
@RestController
public class StudentController {
	
	
	
	@PostMapping("/insertdata")
	public String insertData(@RequestBody Student student) {
		System.out.println("Received data is : "+student);
		return "Given data inserted into database successfully...";
	}
	
	@PutMapping("/updateData")
	public String updateDate(@RequestBody Student student) {
		System.out.println("Given data to update is : "+student);
		return "Given record is updated into database successfully...";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		System.out.println("Given id to delete is : "+id);
		return "Record with id "+id+" is deleted successfully";
	}
}
