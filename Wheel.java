package practiceJava;

class WheelClass {
	private double rim;
	private double tire;

	public WheelClass(double rim, double tire) {
		this.rim = rim;
		this.tire = tire;
	}

	public double diameter() {
		return rim + tire*2;
	}
}

public class Wheel {
	public static void main(String [] args) {
		WheelClass w1 = new WheelClass(52,11);
		System.out.println("Diameter is " + w1.diameter());

		WheelClass w2 = new WheelClass(30,27);
		System.out.println("Diameter is " + w2.diameter());
	}
}
