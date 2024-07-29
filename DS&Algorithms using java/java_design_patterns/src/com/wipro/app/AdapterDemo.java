package com.wipro.app;
import com.wipro.model.BugattiVeyron;
import com.wipro.model.Movable;
import com.wipro.model.MovableAdapter;
import com.wipro.model.MovableAdapterImpl;
public class AdapterDemo {
	public static void main(String[] args) {
		Movable bugatti = new BugattiVeyron();
		System.out.println("Speed of Bugatti in MPH is "+ bugatti.getSpeed());
		
		MovableAdapter movableAdapter = new MovableAdapterImpl(bugatti);
		
		System.out.println("Speed in KMPH: "+ movableAdapter.getSpeed());
		
		
	}
}
