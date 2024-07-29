package com.wipro.app;
import com.wipro.model.Singleton;
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton singleton= Singleton.getInstance();
		System.out.println(singleton);
		Singleton singletonNew  = Singleton.getInstance();
		System.out.println(singletonNew);
	}
}

