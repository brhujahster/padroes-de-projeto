package com.softengine.builder.builders;

import com.softengine.builder.car.Manual;
import com.softengine.builder.interfaces.Builder;
import com.softengine.builder.interfaces.CarType;
import com.softengine.builder.interfaces.Engine;
import com.softengine.builder.interfaces.GPSNavigator;
import com.softengine.builder.interfaces.Trasmission;
import com.softengine.builder.interfaces.TripComputer;

public class CarManualBuilder implements Builder{
	
    private CarType type;
    private int seats;
    private Engine engine;
    private Trasmission transmission;
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
		this.transmission = transmission;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public void setGPSNavigator(GPSNavigator gps) {
		this.gpsNavigator = gps;
	}

	 public Manual getResult() {
	        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	    }
}