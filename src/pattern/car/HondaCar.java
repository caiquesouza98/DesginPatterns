package pattern.car;

public class HondaCar extends Car {
	
	public HondaCar() {
		setMaxSpeed(200);
		setConfort("Medium");
	}

	@Override
	public String toString() {
		return "Honda car: maxSpeed= " + getMaxSpeed() + "km/h" + ", confort= " + getConfort();
	}
}
