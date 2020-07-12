package practiceJava;

import java.util.HashMap;

class Gear {
	private double size;
	private double tape_color;	
	public Gear(HashMap<String, Integer> map1) {
		this.size = map1.get("size");
		this.tape_color = map1.get("tape_color");
	}
	public void spares() {
		System.out.println("chain: " + 10);
		System.out.println("size: " + size);
		System.out.println("tape_color: " + tape_color);
	}
}

public class ConcreteClass {
	public static void main(String [] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("size", 10);
		map1.put("tape_color", 1);
		Gear g1 = new Gear(map1);
		g1.spares();
	}
}