package com.wipro.app;
import java.util.ArrayList;
import java.util.List;
public class ExtendSuperDemo {
	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<>();
		List<Number> list2= new ArrayList<>();
		List<Long> list3= new ArrayList<>();
		List<String> list4= new ArrayList<>();
		
		List<Object> list5= new ArrayList<>();
		
		printValues(list1);
		printValues(list2);
		printValues(list3);
		
		printNonNumericValues(list4);
		printNonNumericValues(list5);
		
	}
	//super is lower-bound, String and above
	private static void printNonNumericValues(List<? super String> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	//extends is upper-bound, Number and below
	private static void printValues(List<? extends Number> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}	
	
}

