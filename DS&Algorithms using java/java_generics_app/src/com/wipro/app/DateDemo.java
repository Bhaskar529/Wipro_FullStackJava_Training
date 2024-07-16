package com.wipro.app;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/*
* Leagacy Date API classes are placed in java.util package
* Java EPOCH:
* 	This is the base time line in Java i.e all date and time related
* calculations are based on this timeline.
* 	01-01-1970 00:00:00 GMT
*
* So 1st January 1970 mid-night 12 AM is Java epoch
*
* Calendar is an abstract class and GregorianCalendar is the concrete
* sub class of Calendar
*/
public class DateDemo {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Date today = new Date();
		//Thu Jul 11 14:50:11 IST 2024
		System.out.println(today);
		//pass time in milliseconds(1000 ms  = 1s)
		Date someDate = new Date(6789876789989L);
		//01-01-1970 00:00:00 + 6789876789989L
		//Mon Feb 28 18:23:09 IST 2185
		System.out.println(someDate);
		
		
		try {
			//convert String -> Date
			System.out.println("Enter birthdate(dd-mm-yyyy): ");
			String dateAsString = scanner.nextLine();
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyyy");
			Date birthdate = dateFormat.parse(dateAsString);
			System.out.println(birthdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Calendar hiredate = new GregorianCalendar(2022,10,15);
		System.out.println(hiredate.get(Calendar.DATE));
		
	}
}
