package pattern.currency;

public class RealAdapterImpl implements RealAdapter {
	private Dollar dollar;
	
	public RealAdapterImpl(Dollar dollar) {
		this.dollar = dollar;
	}
	
	@Override
	public double getValue() {
		return convertDollarToReal(dollar.getValue());
	}

	private double convertDollarToReal(double value) {
		return value * 5.2050338;
	}
}
