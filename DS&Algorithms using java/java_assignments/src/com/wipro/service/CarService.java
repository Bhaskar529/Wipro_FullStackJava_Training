package com.wipro.service;

import com.wipro.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


// write the code using Stream API
public class CarService {
//returns sum of prices of all the cars in the list
public static double getSumOfPrices(List<Car> carList) {
	 
return carList.stream().map(c->c.getPrice()).reduce((a,b)->a+b).get(); 
}

  //returns list of all car names
public static List<String> getCarNames(List<Car> carList) {
	return  carList.stream().map(c->c.getCarName()).toList();
	 
}

//returns Cars in the range of 8 Lakhs to 15 Lakhs
public static List<Car> getCarsInRange(List<Car> carList) {
	return carList.stream().
			filter(s->s.getPrice()>800000)
			.filter(s->s.getPrice()<1500000).toList();
}

//returns car which has least price
public static Car getLowestCar(List<Car> carList) {
	return  carList.stream().min((a,b)->a.getPrice().compareTo(b.getPrice())).get();
	
}

//returns List of Cars in the descending order of price
public  static List<Car> getSortedCars(List<Car> carList){
	return carList.stream().sorted((a,b)->a.getPrice().compareTo(b.getPrice())).toList();
}
}


//Write a Tester class in com.wipro.app package com.wipro.service 
//test the methods of CarService class.
