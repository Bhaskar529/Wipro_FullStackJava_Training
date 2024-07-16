package com.wipro.app;
import com.wipro.model.Employee;
public class EmployeeBuilderDemo {
	public static void main(String[] args) {
		Employee employee =
				new Employee.EmployeeBuilder(1001)
					.getName("Smith")
					.getDepartmentName("Accounts")
					.build();
		
		System.out.println(employee.getName());
		
	}
}

