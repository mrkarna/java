package practiceJava;

class Bicycle {
	private int size;
	private Parts parts;
	public Bicycle(int size, Parts parts) {
		this.size = size;
		this.parts = parts;
	}

	public void spares() {
		System.out.println("size: " + size);
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
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}	
}

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

class PartsFactory {
	Part p;
	public PartsFactory(String name, String description, boolean needs_spare) {
		p = new Part(name, description, needs_spare);
	}

	public void spares() {
		System.out.println("name: " + p.getName());
		System.out.println("description: " + p.getDescription());
	}
}

public class ComposedBicycles {
	public static void main(String [] args) {
		Parts chain = new Parts("chain", 14);

		Bicycle b1 = new Bicycle(10, chain);
		b1.spares();
	}
}