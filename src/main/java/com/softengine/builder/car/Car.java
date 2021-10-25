package com.softengine.builder.car;

import com.softengine.builder.interfaces.CarType;
import com.softengine.builder.interfaces.Engine;
import com.softengine.builder.interfaces.GPSNavigator;
import com.softengine.builder.interfaces.Trasmission;
import com.softengine.builder.interfaces.TripComputer;

public class Car {

	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Trasmission trasmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;
	
	public Car(CarType carType, int seats, Engine engine, Trasmission trasmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.trasmission = trasmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
		
		if(this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
	}
	
	public CarType getCarType() {
		return carType;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Trasmission getTrasmission() {
		return trasmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
}
