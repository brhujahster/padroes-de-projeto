package com.softengine.builder;

import com.softengine.builder.builders.CarBuilder;
import com.softengine.builder.builders.CarManualBuilder;
import com.softengine.builder.car.Car;
import com.softengine.builder.car.Manual;
import com.softengine.builder.director.Director;

public class App {

	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSportCars(builder);
		
		Car car = builder.getResult();
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		
		director.constructSportCars(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		
		System.out.println("\nCar Manual built:\n" + carManual.print());
	}
}
