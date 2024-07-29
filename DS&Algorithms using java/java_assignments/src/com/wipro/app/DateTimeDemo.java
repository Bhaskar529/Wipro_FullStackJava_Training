package com.wipro.app;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

import com.wipro.service.DateTime;
public class DateTimeDemo {
	public static void main(String[] args) {
		/*DateTime dateTime=()->{
			LocalDateTime d= LocalDateTime.now();
			return d.toString();
			
		};
		System.out.println(dateTime.getDateTime());*/
		Supplier<String> s=()->LocalDateTime.now().toString();
		
		System.out.println(s.get());
	}
}
