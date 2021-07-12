package pattern;

import pattern.car.Car;
import pattern.factory.AbstractFactory;
import pattern.factory.Brand;
import pattern.motorcycle.Motorcycle;

public class Demo {

	public static void main(String[] args) {

		AbstractFactory bmwFactory = AbstractFactory.getFactory(Brand.BMW_VEHICLE);
		Car bmwCar = bmwFactory.createCar();
		System.out.println(bmwCar);
		Motorcycle bmwMotorcycle = bmwFactory.createMotorcycle();
		System.out.println(bmwMotorcycle);
		
		AbstractFactory hondaFactory = AbstractFactory.getFactory(Brand.HONDA_VEHICLE);
		Car hondaCar = hondaFactory.createCar();
		System.out.println(hondaCar);
		Motorcycle hondaMotorcycle = hondaFactory.createMotorcycle();
		System.out.println(hondaMotorcycle);
	}

}
