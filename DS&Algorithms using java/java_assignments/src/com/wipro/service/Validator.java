package com.wipro.service;
import com.wipro.model.Shipment;
public class Validator {
	
	public static boolean isValidShipment(Shipment s) {
		if(s.getShipmentDate().isBefore(s.getOrderDate()) ||
				s.getShipmentDate().isAfter(s.getDeliveryDate()))
					return false;
		return true;
		
	}
	
}
