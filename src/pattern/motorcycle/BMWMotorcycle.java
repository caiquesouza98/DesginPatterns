package pattern.motorcycle;

public class BMWMotorcycle extends Motorcycle {

	public BMWMotorcycle() {
		setMaxSpeed(320);
	}
	
	@Override
	public String toString() {
		return "BMW motorcycle: " + getMaxSpeed() + "km/h";
	}
}
