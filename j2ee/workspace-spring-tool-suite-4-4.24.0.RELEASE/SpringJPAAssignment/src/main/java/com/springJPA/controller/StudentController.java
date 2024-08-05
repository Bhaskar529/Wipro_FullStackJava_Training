package com.springJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springJPA.data.Student;
import com.springJPA.repository.IStuRepository;

@RestController
public class StudentController {
	
	@Autowired
	IStuRepository stuRepo;
	
	@GetMapping("/getAllRecords")
	public List<Student> getAllRecords(){
		List<Student> stuList=stuRepo.findAll();
		return stuList;
	}
	@PostMapping("/insertData")
	public String insertData(@RequestBody Student student) {
		System.out.println("Received Data is : "+student);
		stuRepo.save(student);
		return "Given data is inserted into database successfully";
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Student student) {
		System.out.println("Given data to update is : "+student);
		stuRepo.save(student);
		return "Given data is updated successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		System.out.println("Given id to delete is : "+id);
		stuRepo.deleteById(id);
		return "Given id "+id+" is deleted successfully...";
	}
	
}
