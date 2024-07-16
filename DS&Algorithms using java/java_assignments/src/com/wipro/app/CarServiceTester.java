package com.wipro.app;

import java.util.Arrays;
import java.util.List;

import com.wipro.model.Car;
import com.wipro.service.CarService;

public class CarServiceTester {
	public static void main(String[] args) {
		Car[] car=new Car[] {
				new Car("Rohit","Baleno",1000000.00),
				new Car("Varun","Bugaati cheeron",3200000.00),
				new Car("siva","suzuki",600000.00),
				new Car("Raja","inova",1200000.00)
		};//Car
		List<Car> carList=Arrays.asList(car);
		
		double sumOfCars = CarService.getSumOfPrices(carList);
		System.out.println("Prices of all cars : "+sumOfCars);
		
		System.out.println("=======================================");
		
		List<String> carNames = CarService.getCarNames(carList);
		carNames.forEach(System.out::println);
		
		System.out.println("=======================================");
		
		List<Car> carsInRange = CarService.getCarsInRange(carList);
		carsInRange.forEach(System.out::println);
		
		System.out.println("=======================================");
		
		Car lowestCar = CarService.getLowestCar(carList);
		System.out.println("Lowest priced car is : "+lowestCar);
		
		System.out.println("=======================================");
		
		List<Car> sortedCars = CarService.getSortedCars(carList);
		sortedCars.forEach(p->System.out.println(p));
		
	}//main
}//class
