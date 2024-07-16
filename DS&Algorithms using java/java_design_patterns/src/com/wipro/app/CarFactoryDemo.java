package com.wipro.app;
import com.wipro.model.Car;
import com.wipro.model.CarFactory;
import com.wipro.model.CarTyp;
public class CarFactoryDemo {
	
	public static void main(String[] args) {
		
//		String carType = "sedan";
		String carType = "suv";
		CarTyp carTyp;
		
		if(carType.equalsIgnoreCase("SEDAN")) {
			carTyp =  CarTyp.SEDAN;
		}else if(carType.equalsIgnoreCase("small")) {
			carTyp = CarTyp.SMALL;
		}else {
			carTyp = CarTyp.SUV;
		}
		
//		Car myCar = CarFactory.createCar(carTyp, "Skoda", "Rapid", 1565000.00);
		Car myCar = CarFactory.createCar(carTyp, "BMW", "X1", 5650000.00);
		System.out.println(myCar.getManufacturer()+","+myCar.getModel()+","+myCar.getPrice());
	};
}

