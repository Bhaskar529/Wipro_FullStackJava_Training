
package com.wipro.app;
import com.wipro.service.Box;
public class BoxDemo {
	public static void main(String[] args) {
		Box<Integer> box1= new Box<>(5,5,5);
		Box<Double> box2= new Box<>(7.2,5.6,9.0);
		
		System.out.println("Volume of box1 = "+ box1.getLength()*box1.getWidth()*box1.getHeight() );
		System.out.println("Volume of box2 = "+ box2.getLength()*box2.getWidth()*box2.getHeight());
	}
}
