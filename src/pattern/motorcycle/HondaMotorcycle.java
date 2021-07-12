package pattern.motorcycle;

public class HondaMotorcycle extends Motorcycle{

	public HondaMotorcycle() {
		setMaxSpeed(150);
	}
	
	@Override
	public String toString() {
		return "Honda motorcycle: " + getMaxSpeed() + "km/h";
	}
}
