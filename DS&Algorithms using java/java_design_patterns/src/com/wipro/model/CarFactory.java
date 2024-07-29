package com.wipro.model;
/*
* Factory creating different types of Cars
*/
public class CarFactory {
	public static Car createCar(CarTyp carTyp, String manufacturer,
										String model, Double price) {
		switch(carTyp) {
			case CarTyp.SMALL:
					return new SmallCar(manufacturer,model,price);
			case CarTyp.SEDAN:
					return new SedanCar(manufacturer,model,price);
			case CarTyp.SUV:
				return new SuvCar(manufacturer,model,price);
					
		}
		
		return null;
	}
	
}

