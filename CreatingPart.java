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

class Part {
	private String name;
	private String description;
	private boolean needs_spare;
	public Part(String name, String description, boolean needs_spare) {
		this.name = name;
		this.description = description;
		this.needs_spare = needs_spare;
	}
}

class Bicycle {
	private String size;
	private Part part;
	public Bicycle(String size, Part part) {
		this.size = size;
		this.part = part;
	}

	public void spares() {
		System.out.println("size: " + size);
	}
}	

public class CreatingPart {
	public static void main(String [] args) {
		Part chain = new Part("chain", "10-speed", true);
		Part road_tire = new Part("tire_size", "23", true);
		Part tape = new Part("tape_color", "red", true);

		Bicycle b1 = new Bicycle("L", chain);
		b1.spares();

		Bicycle b2 = new Bicycle("M", road_tire);
		b2.spares();

		Bicycle b3 = new Bicycle("S", tape);
		b3.spares();
	}
}