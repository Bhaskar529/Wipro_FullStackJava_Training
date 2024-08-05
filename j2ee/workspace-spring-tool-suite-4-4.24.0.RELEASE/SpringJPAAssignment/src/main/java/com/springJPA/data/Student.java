package com.springJPA.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Student")
public class Student {
	@Id
	int id;
	String name;
	String stream;
	int marks;
	
	Student(){}

	public Student(int id, String name, String stream, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + ", marks=" + marks + "]";
	}
	
	

}
