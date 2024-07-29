package com.wipro.app;
import java.util.ArrayList;
import java.util.List;
public class GenericListDemo {
	public static void main(String[] args) {
		List<Integer> myList1= new ArrayList<>();
		myList1.add(10); myList1.add(20); myList1.add(30);
		
		printList(myList1);
		
		List<String> myList2= new ArrayList<>();
		myList2.add("Java");myList2.add("Java EE");
		myList2.add("Javascript");
		
		printList(myList2);
	}
	
	//Wild Card ? is unbounded , no restriction
	public static void printList(List<?> list) {
		   for (Object elem : list)
		       	System.out.println(elem + " ");
		   System.out.println();
		}
}


