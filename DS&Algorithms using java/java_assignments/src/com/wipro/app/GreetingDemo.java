package com.wipro.app;
import java.util.function.Consumer;

import com.wipro.service.Greeting;

public class GreetingDemo {
	public static void main(String[] args) {
		/*Greeting greetingMessage=(name)->{
			System.out.println("Good Day, "+name);
		};
		greetingMessage.greeting("Varun");*/
		
		
		Consumer<String> c=(name)->{
			System.out.println("Good Day, "+name);
		};
		c.accept("Bhaskar");
		
		
	}//main
}//class
