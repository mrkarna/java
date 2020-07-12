package practiceJava;

public class CalculateRatio {
	public static double calculate(double chainring, double cog) {
		return chainring/cog;
	}

	public static void main(String [] args) {
		double chainring = 52;
		double cog = 11;
		System.out.println("Ratio is " + calculate(chainring, cog));

		chainring = 30;
		cog = 27;
		System.out.println("Ratio is " + calculate(chainring, cog));
	}
}
