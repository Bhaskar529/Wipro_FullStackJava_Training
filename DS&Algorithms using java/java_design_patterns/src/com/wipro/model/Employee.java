package com.wipro.model;
public class Employee {
	private Integer empid;
	private String name;
	private String departmentName;
	
	
	public Employee(EmployeeBuilder builder) {
		empid = builder.empid;
		name = builder.name;
		departmentName= builder.departmentName;
	}
	
	public static class EmployeeBuilder{
		private Integer empid;
		private String name;
		private String departmentName;
		
		
		public EmployeeBuilder(Integer empid) {
			this.empid= empid;		
		}
		
		public EmployeeBuilder getName(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder getDepartmentName(String departmentName) {
			this.departmentName=departmentName;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
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
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
