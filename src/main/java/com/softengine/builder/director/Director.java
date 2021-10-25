package com.softengine.builder.director;

import com.softengine.builder.interfaces.Builder;
import com.softengine.builder.interfaces.CarType;
import com.softengine.builder.interfaces.Engine;
import com.softengine.builder.interfaces.GPSNavigator;
import com.softengine.builder.interfaces.Trasmission;
import com.softengine.builder.interfaces.TripComputer;

public class Director {

	public void constructSportCars(Builder builder) {
		builder.setCarType(CarType.SPORT_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Trasmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Trasmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructSUV(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Trasmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}
