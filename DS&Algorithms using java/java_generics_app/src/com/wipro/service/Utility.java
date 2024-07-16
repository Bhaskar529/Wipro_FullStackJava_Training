package com.wipro.service;
/**
* Generic Method
* syntax:
* 	 public static <T> returnType methodName(T t1, T t2)
*
*  Ex.
*  public static <K,V> boolean compare(OrderedPair<K,V> p1, OrderedPair<K,V> p2)
*/
public class Utility {
	public static <K,V> boolean compare(OrderedPair<K,V> p1, OrderedPair<K,V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
}

