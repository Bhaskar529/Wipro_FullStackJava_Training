package com.wipro.app;
import com.wipro.service.OrderedPair;
public class OrderedPairDemo {
	public static void main(String[] args) {
		OrderedPair<Integer,Integer> orderedPair1 = new OrderedPair<>(4,4);
		OrderedPair<Integer, Long> orderedPair2 = new OrderedPair<>(4,4L);
		OrderedPair<Double, Double> orderedPair3 = new OrderedPair<>(4.0,4.0);
		
		System.out.println(orderedPair1);
		System.out.println(orderedPair2);
		System.out.println(orderedPair3);
		
		
	}
}
