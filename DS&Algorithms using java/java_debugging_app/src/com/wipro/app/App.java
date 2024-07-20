package com.wipro.app;

public class App {
	public static void main(String[] args) {
		int sum=0;
		int num=5;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		double average=sum/10.0;
		System.out.println("Sum + "+sum+"Average ="+average);
	
		double result=Math.sqrt((int)average);
		System.out.println(result);
		
		long sumOfCubes=getSumOfCubes(num);
		System.out.println(sumOfCubes);
	}

	private static long getSumOfCubes(int num) {
		long result=0;
		for(int i=1;i<=num;i++) {
			result=result+i*i;
		}
		return result;
	}
}
