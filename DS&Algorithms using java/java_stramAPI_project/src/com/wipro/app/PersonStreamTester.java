package com.wipro.app;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.wipro.model.Gender;
import com.wipro.model.Person;
public class PersonStreamTester {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		populatePersons(personList);
		System.out.println("List of persons...");
		personList.forEach(System.out::println);


		//get all person names
		List<String> namesList = getAllNames(personList);
		System.out.println("All person names...");
		namesList.forEach(System.out::println);
		
		List<Person> femaleList = getAllFemales(personList);
		System.out.println("Female list..");
		femaleList.forEach(System.out::println);

		//return list of persons in alphabetical order of names
				List<String> sortedPersonList = sortedPersons(personList);
				System.out.println("Sorted list of persons..");
				sortedPersonList.forEach(System.out::println);
				


				/*
				 * City Name   Count
				 * Hyderabad	2
				 * Chennai		1
				 * Pune			1
				 * Mumbai		1
				 */
				Map<String,Integer> cityMap = getPersonCountByCity(personList);
				//display cityMap	
				System.out.println("City Map of persons...");
				cityMap.forEach((city,count)->
				System.out.println(city+"\t\t"+count));


				
	}
	
	private static Map<String, Integer> getPersonCountByCity(List<Person> personList) {
		//this returns Map<String,Long>
		
		/*Map<String,Long> cityMap=personList.stream()
				.collect(Collectors.groupingBy(Person::getAddress,
						Collectors.counting()));
		return cityMap;*/
		
		Map<String,Integer> temp = new HashMap<>();
		Iterator<Person> iterator = personList.iterator();
		while(iterator.hasNext()) {
			String key=iterator.next().getAddress();
			temp.put(key, temp.getOrDefault(key,0 )+1);
		}
		return temp;
		
	}

	private static List<String> sortedPersons(List<Person> personList) {
		List<String> sortedNamesList=personList.stream().
				map(p->p.getName()).sorted().toList();
									
		return sortedNamesList;
	//return personList.stream().sorted(Comparator.comparing(p->p.getName())).toList();;
	
	}

	private static List<Person> getAllFemales(List<Person> personList) {
		List<Person> femaleList = personList.stream()
				.filter(p->p.getGender().equals(Gender.FEMALE))
				.toList();

		return femaleList;
	}

	
	private static List<String> getAllNames(List<Person> personList) {
		List<String> namesList=personList.stream().map(s->s.getName())
				.map(p->p.toUpperCase()).toList();
		return namesList;
	}

	private static void populatePersons(List<Person> personList) {
		personList.add(new Person(123456789L,"Smith",Gender.MALE,
		LocalDate.of(2000, 9, 12),"Hyderabad",987898879L ));
		
		personList.add(new Person(213456585L,"Priya",Gender.FEMALE,
				LocalDate.of(2002, 10, 15),"Pune",987898879L ));
		
		personList.add(new Person(103456709L,"Clarke",Gender.MALE,
				LocalDate.of(1995, 10, 21),"Mumbai",987898879L ));
		
		personList.add(new Person(523450009L,"Bhavya",Gender.FEMALE,
				LocalDate.of(1986, 11, 12),"Hyderabad",987898879L ));
		
		personList.add(new Person(200345600L,"Virat",Gender.MALE,
				LocalDate.of(2001, 12, 12),"Chennai",987898879L ));
		
	}
}
