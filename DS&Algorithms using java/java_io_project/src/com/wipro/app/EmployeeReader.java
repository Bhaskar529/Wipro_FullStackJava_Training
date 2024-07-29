package com.wipro.app;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.wipro.model.Employee;
/*
* display contents of file, employee.ser
*/
public class EmployeeReader {
	public static void main(String[] args) {
		File file = new File("/home/rps/Documents/employee.ser");
		if(file.exists() && file.canRead()) {
			try(
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
					){
				Employee employee;
				while( ( employee = (Employee) ois.readObject() )!= null) {
					System.out.println(employee);
				}
				
			}catch(EOFException e) {
				System.out.println("End of file");
			}catch(IOException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
