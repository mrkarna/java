package practiceJava;

import java.util.HashMap;

abstract class Bicycle {
	String size;
	String chain;
	String tire_size;
	public void default_chain() {
		System.out.println("10-speed");
	}
}	

class RoadBike extends Bicycle
{
	public RoadBike(HashMap<String, String> map1) {
		this.size = map1.get("size");
		this.chain = map1.get("chain");
		this.tire_size = map1.get("tire_size");
	}
	public void default_tire_size() {
		System.out.println("23");
	}
}

class MountainBike extends Bicycle
{
	public MountainBike(HashMap<String, String> map1) {
		this.size = map1.get("size");
		this.chain = map1.get("chain");
		this.tire_size = map1.get("tire_size");
	}
	public void default_tire_size() {
		System.out.println("2.1");
	}
}

public class Template {
	public static void main(String [] args) {
		HashMap<String, String>m = new HashMap<>();
		m.put("size","M");
		m.put("chain","10");
		m.put("tire_size","12");
		RoadBike rb = new RoadBike(m);
		System.out.println(rb.tire_size);

		HashMap<String, String>n = new HashMap<>();
		n.put("size","S");
		n.put("chain","11");
		n.put("tire_size","10");
		MountainBike mb = new MountainBike(n);
		System.out.println(mb.size);
	}
}