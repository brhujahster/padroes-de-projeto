package com.softengine.builder.interfaces;

import com.softengine.builder.car.Car;

public class TripComputer {

	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void showFuellLevel() {
		System.out.println("Fuel level: " + car.getFuel());
	}
	
	public void showStatus() {
		if(car.getEngine().isStarted()) {
			System.out.println("Car is Started");
		} else {
			System.out.println("Car isn't started");
		}
	}
}
