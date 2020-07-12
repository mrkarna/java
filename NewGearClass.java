package practiceJava;

class Gear {
	private double chainring;
	private double cog;	
	private double rim;
	private double tire;

	public Gear(double chainring, double cog, double rim, double tire) {
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double ratio() {
		return chainring/cog;
	}

	public double gearInches() {
		return ratio() * (rim + (tire * 2));
	}
}

public class NewGearClass {
	public static void main(String [] args) {
		Gear g1 = new Gear(52,11,26,1.5);
		System.out.println("Ratio is " + g1.gearInches());

		Gear g2 = new Gear(52,11,24,1.25);
		System.out.println("Ratio is " + g2.gearInches());
	}
}
