package com.wipro.model;

public class Car {
private String manufacturerName;
private String carName;
private Double price;

public Car() {

}

public Car(String manufacturerName, String carName, Double price) {
super();
this.manufacturerName = manufacturerName;
this.carName = carName;
this.price = price;
}

public String getManufacturerName() {
return manufacturerName;
}

public void setManufacturerName(String name) {
manufacturerName = name;
}

public String getCarName() {
return carName;
}

public void setCarName(String carName) {
this.carName = carName;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
 this.price = price;
}

@Override
public String toString() {
	return "Car [manufacturerName=" + manufacturerName + ", \ncarName=" + carName + ", price=" + price + "]";
}


}
