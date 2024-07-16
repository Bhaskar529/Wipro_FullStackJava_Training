
package com.wipro.model;
public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;
	public MovableAdapterImpl() {
	}
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}
	@Override
	public double getSpeed() {
		return luxuryCars.getSpeed() * 1.6;
	}
	
	
}
