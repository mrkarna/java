package practiceJava;

import java.util.HashMap;

class Bicycle {
	private String style;
	private String size;
	private String tape_color;	
	private String front_shock;
	private String rear_shock;

	public Bicycle(HashMap<String, String> map1) {
		this.style = map1.get("style");
		this.size = map1.get("size");
		this.tape_color = map1.get("tape_color");
		this.front_shock = map1.get("front_shock");
		this.rear_shock = map1.get("rear_shock");
	}

	public void spares() {
		if(style == "road") {
			System.out.println("chain: " + 10);
			System.out.println("size: " + 23);
			System.out.println("tape_color: " + tape_color);	
		}
		else {
			System.out.println("chain: " + 10);
			System.out.println("size: " + 2.1);
			System.out.println("rear_shock: " + rear_shock);
		}
	}
}

public class EmbeddingTypes {
	public static void main(String [] args) {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("style", "10");
		map1.put("size", "10");
		map1.put("tape_color", "1");
		map1.put("front_shock", "Manitou");
		map1.put("rear_shock", "Fox");
		Bicycle b = new Bicycle(map1);
		b.spares();
	}
}