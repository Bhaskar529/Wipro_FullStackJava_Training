package com.wipro.app;
import com.wipro.service.Factorial;

public class FactorialDemo {
	public static void main(String[] args) {
		Factorial fact = (num)->{
			long f=1;
			for(int i=1;i<=num;i++) {
				f=f*i;
			}//for
			return f;
		};//lambda
		System.out.println(fact.factorial(4));
	}//main
}//class
