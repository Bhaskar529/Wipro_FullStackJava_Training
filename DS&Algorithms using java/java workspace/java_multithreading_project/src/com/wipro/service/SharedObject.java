package com.wipro.service;
/**
* StringBuffer methods are synchronized by default hence the StringBuffer objects
* are thread-safe.
*
* StringBuilder methods are not synchronized hence not thread-safe.
*
* Note: Both are mutable objects
*/
public class SharedObject implements Runnable{
	private static StringBuilder sharedData= new StringBuilder("Welcome");
	
/*	public synchronized void run() {
		
		int length = sharedData.length();
		for(int i=0;i<length;i++) {
			System.out.println(Thread.currentThread().getName() + "-"+ sharedData.append("x"));
		}
		
	}*/
	@Override
	/*public void run() {
		
		int length = sharedData.length();
		synchronized(sharedData) {
		for(int i=0;i<length;i++) {
			System.out.println(Thread.currentThread().getName() + "-"+ sharedData.append("x"));
		}
	}
	}
	*/
public void run() {
		
		int length = sharedData.length();
		
		for(int i=0;i<length;i++) {
			System.out.println(Thread.currentThread().getName() + "-"+ sharedData.append("x"));
		}
	
	}	
	
	
}
