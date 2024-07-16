package com.wipro.app;
import java.time.LocalDate;

import com.wipro.model.Shipment;
import com.wipro.service.Validator;
public class Tester {
	
	public static void main(String[] args) {
		Shipment s=new Shipment(1231323L,
				LocalDate.of(2024, 06, 10),
				"Alice",
				43534L,
				LocalDate.of(2024, 6, 8),
				LocalDate.of(2024, 6, 12),"order Placed");
		Validator validatot=new Validator();
		boolean result = Validator.isValidShipment(s);
		if(result) {
			System.out.println("Order Delivered...");
		}
		else
			System.out.println("Invalid shipment");
	}
	
}
