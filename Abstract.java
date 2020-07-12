package practiceJava;

import java.util.HashMap;

abstract class Bicycle {
	String size;
}	

class RoadBike extends Bicycle
{
	private String tape_color;
	public RoadBike() {
		this.size = "M";
		this.tape_color = "red";
	}
}

class MountainBike extends Bicycle
{
	private String front_shock;
	private String rear_shock;
	public MountainBike() {
		this.size = "S";
		this.front_shock = "manitou";
		this.rear_shock = "fox";
	}
}

public class Abstract {
	public static void main(String [] args) {
		MountainBike mb = new MountainBike();
		System.out.println(mb.size);
	}
}