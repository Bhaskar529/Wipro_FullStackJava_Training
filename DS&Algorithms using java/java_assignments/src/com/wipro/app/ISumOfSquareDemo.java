package com.wipro.app;
import com.wipro.service.ISumOfSquare;
public class ISumOfSquareDemo {
	
	public static void main(String[] args) {
		ISumOfSquare sum=(n)->{
			long res=0;
			for(int i=1;i<=n;i++) {
				res=res+i*i;
			}
			return res;
		};//end of lambda
		
		System.out.println("Sum of Squares of numbers from 1 to "+10+" is : "+sum.SumOfSquares(10));
	}
	
	
}
