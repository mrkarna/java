package practiceJava;

class Parts {
	private String chain;
	private int tire_size;
	public Parts(String chain, int tire_size) {
		this.chain = chain;
		this.tire_size = tire_size;
	}

	public void spares() {
		System.out.println("chain: " + chain);
		System.out.println("tire_size: " + tire_size);
	}
}

class RoadBike extends Parts
{
	private String tape_color;
	public RoadBike(String tape_color, String chain, int tire_size) {
		super(chain, tire_size);
		this.tape_color = tape_color;
	}

	public void spares() {
		super.spares();
		System.out.println("tape_color: " + tape_color);
	}
}

class MountainBike extends Parts
{
	private String front_shock;
	private String rear_shock;
	public MountainBike(String front_shock, String rear_shock, String chain, int tire_size) {
		super(chain, tire_size);
		this.front_shock = front_shock;
		this.rear_shock = rear_shock;
	}

	public void spares() {
		super.spares();
		System.out.println("rear_shock: " + rear_shock);
	}
}

class Bicycle {
	private String size;
	private Parts parts;
	public Bicycle(String size, Parts parts) {
		this.size = size;
		this.parts = parts;
	}

	public void spares() {
		System.out.println("size: " + size);
	}
}	

public class PartsHierarchy {
	public static void main(String [] args) {
		System.out.println("Road Bike");
		RoadBike rb = new RoadBike("red", "12", 23);
		rb.spares();		

		System.out.println("Mountain Bike");
		MountainBike mb = new MountainBike("manitou", "fox", "10", 21);
		mb.spares();
	}
}