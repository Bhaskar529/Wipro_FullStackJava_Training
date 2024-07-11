package com.wipro.service;

public class factorial implements Runnable{
	private int number;
	public factorial(Long counter) {
		this.number=number;
	}
	
	@Override
	public void run() {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;	
		}
		
		System.out.println(fact);
		
	}
}
