package practiceJava;

class Gear {
	private double chainring;
	private double cog;	
	public Gear(double chainring, double cog) {
		this.chainring = chainring;
		this.cog = cog;
	}
	public double ratio() {
		return chainring/cog;
	}
}

public class GearClass {
	public static void main(String [] args) {
		Gear g1 = new Gear(52,11);
		System.out.println("Ratio is " + g1.ratio());

		Gear g2 = new Gear(30,27);
		System.out.println("Ratio is " + g2.ratio());
	}
}
