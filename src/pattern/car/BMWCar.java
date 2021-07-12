package pattern.car;

public class BMWCar extends Car {

	public BMWCar() {
		setMaxSpeed(300);
		setConfort("Max confort");
	}
	@Override
	public String toString() {
		return "BMW car: maxSpeed= " + getMaxSpeed() + "km/h" + ", confort= " + getConfort();
	}
}
