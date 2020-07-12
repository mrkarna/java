package practiceJava;

import java.util.HashMap;

class Gear {
	private double chainring;
	private double cog;	
	public Gear(HashMap<String, Integer> map1) {
		this.chainring = map1.get("chainring");
		this.cog = map1.get("cog");
	}
	public double ratio() {
		return chainring/cog;
	}
}

public class RemoveArgument {
	public static void main(String [] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("chainring", 52);
		map1.put("cog", 11);
		Gear g1 = new Gear(map1);
		System.out.println("Ratio is " + g1.ratio());
	}
}
