package pattern.factory;

import pattern.car.Car;
import pattern.motorcycle.Motorcycle;

public abstract class AbstractFactory {
	private static final BMWVehicle BMW_VEHICLE = new BMWVehicle();
	private static final HondaVehicle HONDA_VEHICLE = new HondaVehicle();
	
	public static AbstractFactory getFactory(Brand brand) {
		AbstractFactory factory = null;
		
		switch(brand) {
		case BMW_VEHICLE:
			factory = BMW_VEHICLE;
			break;
		case HONDA_VEHICLE:
			factory = HONDA_VEHICLE;
			break;
		}
		
		return factory;
	}

	public abstract Car createCar();
	public abstract Motorcycle createMotorcycle();
}