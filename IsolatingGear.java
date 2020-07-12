package practiceJava;

class Gear {
	private double chainring;
	private double cog;	
	private Wheel w1;
	
	public Gear(double chainring, double cog, Wheel w1) {
		this.chainring = chainring;
		this.cog = cog;
		this.w1 = w1;
	}

	public double ratio() {
		return chainring/cog;
	}

	public double gearInches() {
		return ratio() * w1.diameter();
	}
}

class IsolatingGear {
	public static void main(String [] args) {
		System.out.println("Isolated gear class dependency on wheel class");
	}
}