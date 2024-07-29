package com.wipro.app;
import com.wipro.service.lambdaMaxFinder;
/**
* Lambda expression represents an instance of functional interface
*
* InterfaceType objectName = (arguments) -> {implementation }
*
*
*/
public class LambdaDemo {
	public static void main(String[] args) {
		lambdaMaxFinder maxFinder = (int n1, int n2) -> {
			if(n1>n2) {
				return n1;
			}else {
				return n2;
			}
		};
		
		System.out.println(maxFinder.maxmimum(1029,1029));
		
		lambdaMaxFinder maxFinderNew = (n1,n2) -> (n1>n2)?n1:n2;
		System.out.println(maxFinderNew.maxmimum(10,15));
		
	}
}


