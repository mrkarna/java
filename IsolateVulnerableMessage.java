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

	public double diameter() {
		return w1.diameter();
	}

	public double gearInches() {
		return ratio() * diameter();
	}
}

class Wheel {
	private double rim;
	private double tire;

	public Wheel(double rim, double tire) {
		this.rim = rim;
		this.tire = tire;
	}

	public double diameter() {
		return rim + tire*2;
	}
}

public class IsolateVulnerableMessage {
	public static void main(String [] args) {
		Wheel w1 = new Wheel(26, 1.5);
		Gear g1 = new Gear(52,11,w1);
		System.out.println("Gear Inches is " + g1.gearInches());
	}
}
