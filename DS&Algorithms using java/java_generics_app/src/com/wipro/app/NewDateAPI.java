package com.wipro.app;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
* LocalDate, LocalTime, LocalDateTime
* DateTimeFormatter, Period
*
* The above classes are part of java.time package
*/
public class NewDateAPI {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
			LocalDate today = LocalDate.now();
			//2024-07-11
			System.out.println(today);
			LocalTime currentTime = LocalTime.now();
			//15:15:30.500429340
			System.out.println(currentTime);
			LocalDateTime dateAndTime = LocalDateTime.now();
			//2024-07-11T15:16:34.447399053
			System.out.println(dateAndTime);
			
			LocalDate hiredate = LocalDate.of(2022, 10, 25);
			System.out.println(hiredate);
			LocalDateTime birthdate =
					LocalDateTime.of(2022,1,1, 10,15,30);
			System.out.println(birthdate);
			//String -> LocalDate
			System.out.println("Enter marriage date:(yyyy-mm-dd): ");
			String marriageDateAsString = scanner.nextLine();
			LocalDate marriageDate = LocalDate.parse(marriageDateAsString);
			System.out.println(marriageDate);
			
			System.out.println("Enter exam date: (dd/mm/yyyy)");
			String examAsString = scanner.nextLine();
			DateTimeFormatter formatter =
								DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate examDate = LocalDate.parse(examAsString,formatter);
			System.out.println(examDate);
			
			
			Period period = marriageDate.until(today);
			System.out.println(period.getYears()+" years,"+ period.getMonths()+" months, "+period.getDays()+" days");
			
			if(marriageDate.isAfter(today)) {
				System.out.println("Marriage date is in near future");
			}else {
				System.out.println("Already married");
			}
	}
}


