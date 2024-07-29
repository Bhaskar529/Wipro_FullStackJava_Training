package com.wipro.model;

import java.time.LocalDate;

public class Shipment {
	
	private long shipmentId;
	public LocalDate shipmentDate;
	private  String shipmentTo;
	private  long orderId;
	private  LocalDate orderDate;
	private  LocalDate deliveryDate;
	private  String status;
	
	
	
	
	
	
	public Shipment(long shipmentId,LocalDate shipmentDate, String shipmentTo, long orderId, LocalDate orderDate,
			LocalDate deliveryDate, String status) {
		super();
		this.shipmentDate = shipmentDate;
		this.shipmentTo = shipmentTo;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}






	public long getShipmentId() {
		return shipmentId;
	}






	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}






	public LocalDate getShipmentDate() {
		return shipmentDate;
	}






	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}






	public String getShipmentTo() {
		return shipmentTo;
	}






	public void setShipmentTo(String shipmentTo) {
		this.shipmentTo = shipmentTo;
	}






	public long getOrderId() {
		return orderId;
	}






	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}






	public LocalDate getOrderDate() {
		return orderDate;
	}






	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}






	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}






	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}






	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", shipmentDate=" + shipmentDate + ", shipmentTo=" + shipmentTo
				+ ", orderId=" + orderId + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status="
				+ status + "]";
	}
	
	

}



