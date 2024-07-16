package com.wipro.app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import com.wipro.model.Employee;
public class EmployeeWriter {
	private static BufferedReader bufferedReader =
			new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		File file = new File("/home/rps/Documents/employee.ser");
		try(
				ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream(file));
				){
			while(true) {
				Employee employee = new Employee();
				acceptEmployee(employee);
				oos.writeObject(employee);
				
				System.out.println("To stop, press x: ");
				if(bufferedReader.readLine().equalsIgnoreCase("x")) break;
			}
			System.out.println("Employees saved to file");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void acceptEmployee(Employee employee) {
		try {
			System.out.println("Enter employee Id: ");
			employee.setEmpid(Integer.parseInt(bufferedReader.readLine()));
			System.out.println("Enter employee name: ");
			employee.setName(bufferedReader.readLine());
			System.out.println("Enter employee job: ");
			employee.setJob(bufferedReader.readLine());
			System.out.println("Enter salary: ");
			employee.setSalary(Double.parseDouble(bufferedReader.readLine()));
			System.out.println("Enter department name: ");
			employee.setDeptName(bufferedReader.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
