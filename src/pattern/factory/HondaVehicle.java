package pattern.factory;

import pattern.car.Car;
import pattern.car.HondaCar;
import pattern.motorcycle.HondaMotorcycle;
import pattern.motorcycle.Motorcycle;

public class HondaVehicle extends AbstractFactory{
	
	@Override
	public Car createCar() {
		return new HondaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		return new HondaMotorcycle();
	}
}
