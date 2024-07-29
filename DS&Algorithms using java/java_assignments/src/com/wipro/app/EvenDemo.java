package com.wipro.app;
import com.wipro.service.Even;
public class EvenDemo {
	public static void main(String[] args) {
		Even even=(num)->{
			if(num%2==0)
				return true;
			return false;
		};
		System.out.println(even.isEven(25));
	}
}
