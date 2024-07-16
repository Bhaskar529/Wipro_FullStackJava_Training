package com.wipro.app;
import com.wipro.service.OrderedPair;
import com.wipro.service.Utility;
public class UtilityTest {
	public static void main(String[] args) {
		OrderedPair<Integer,String> p1 = new OrderedPair<>(1,"Apple");
		OrderedPair<Integer,String> p2 = new OrderedPair<>(2,"Banana");
		OrderedPair<Integer,String> p3 = new OrderedPair<>(1,"Apple");
		
		System.out.println(Utility.compare(p1, p2));
		System.out.println(Utility.compare(p2, p3));
		System.out.println(Utility.compare(p1, p3));
		
	}
}
