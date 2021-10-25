package com.softengine.builder.builders;

import com.softengine.builder.car.Car;
import com.softengine.builder.interfaces.Builder;
import com.softengine.builder.interfaces.CarType;
import com.softengine.builder.interfaces.Engine;
import com.softengine.builder.interfaces.GPSNavigator;
import com.softengine.builder.interfaces.Trasmission;
import com.softengine.builder.interfaces.TripComputer;

public class CarBuilder implements Builder{

	private CarType type;
	private int seats;
	private Engine engine;
	private Trasmission trasmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	
	public void setCarType(CarType type) {
		this.type = type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTransmission(Trasmission transmission) {
		this.trasmission = transmission;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public void setGPSNavigator(GPSNavigator gps) {
		this.gpsNavigator = gps;
	}

	public Car getResult() {
		return new Car(type, seats, engine, trasmission, tripComputer, gpsNavigator);
	}
	
}
