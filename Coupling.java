package practiceJava;

import java.util.HashMap;

abstract class Bicycle {
	String size;
	String chain;
	String tire_size;
	public void default_chain() {
		System.out.println("10-speed");
	}
	public void spares() {
		System.out.println("tire_size " + tire_size);
		System.out.println("chain " + chain);
	}
}	

class RoadBike extends Bicycle
{
	String tape_color;
	public RoadBike(HashMap<String, String> map1) {
		this.size = map1.get("size");
		this.chain = map1.get("chain");
		this.tire_size = map1.get("tire_size");
		this.tape_color = map1.get("tape_color");
	}
	public void default_tire_size() {
		System.out.println("23");
	}
	public void spares() {
		super.spares();
		System.out.println("tape_color " + tape_color);
	}
}

class MountainBike extends Bicycle
{
	String front_shock;
	String rear_shock;
	public MountainBike(HashMap<String, String> map1) {
		this.size = map1.get("size");
		this.chain = map1.get("chain");
		this.tire_size = map1.get("tire_size");
		this.front_shock = map1.get("front_shock");
		this.rear_shock = map1.get("rear_shock");
	}
	public void default_tire_size() {
		System.out.println("2.1");
	}
	public void spares() {
		super.spares();
		System.out.println("rear_shock " + rear_shock);
	}
}

class RecumbentBike extends Bicycle
{
	String flag;
	public RecumbentBike(HashMap<String, String> map1) {
		this.size = map1.get("size");
		this.chain = map1.get("chain");
		this.tire_size = map1.get("tire_size");
		this.flag = map1.get("flag");
	}
	public void default_chain() {
		System.out.println("9-speed");
	}
	public void spares() {
		super.spares();
		System.out.println("flag " + flag);
	}
}

public class Coupling {
	public static void main(String [] args) {
		HashMap<String, String>m = new HashMap<>();
		m.put("size","M");
		m.put("chain","10");
		m.put("tire_size","12");
		m.put("flag","tall and orange");
		RecumbentBike rb = new RecumbentBike(m);
		rb.spares();
	}
}