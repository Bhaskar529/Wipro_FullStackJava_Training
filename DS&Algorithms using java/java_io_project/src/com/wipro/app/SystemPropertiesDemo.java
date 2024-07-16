package com.wipro.app;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class SystemPropertiesDemo {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		for(Map.Entry<Object,Object> m : properties.entrySet()) {
				System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println("---------------------------");
		String value = System.getProperty("java.vm.version");
		System.out.println("Java Version: "+ value);
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println(name);
		System.err.println(name);
			
	}
}


