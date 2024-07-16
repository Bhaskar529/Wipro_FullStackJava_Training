package com.wipro.model;
public class Car {
	private CarTyp carTyp;
	private String manufacturer;
	private String model;
	private Double price;
	
	public Car() {
		
	}
	public Car(String manufacturer, String model, Double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
	}
	public CarTyp getCarTyp() {
		return carTyp;
	}
	public void setCarTyp(CarTyp carTyp) {
		this.carTyp = carTyp;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
