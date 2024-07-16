package com.wipro.model;
import java.io.Serializable;
import java.time.LocalDate;
/*
* transient fields will not be serialized
*/
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer empid;
	private String name;
	private String job;
	transient private Double salary;
	private String deptName;
	
	
	public Employee() {
		
	}
	public Employee(Integer empid, String name, String job, Double salary, String deptName) {
		super();
		this.empid = empid;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.deptName = deptName;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", job=" + job + ", salary=" + salary + ", deptName="
				+ deptName + "]";
	}
	
	
}
