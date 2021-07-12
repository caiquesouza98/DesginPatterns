package pattern.factory;

import pattern.car.BMWCar;
import pattern.car.Car;
import pattern.motorcycle.BMWMotorcycle;
import pattern.motorcycle.Motorcycle;

public class BMWVehicle extends AbstractFactory {
	
	@Override
	public Car createCar() {
		return new BMWCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		return new BMWMotorcycle();
	}
}
