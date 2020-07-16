package practiceJava;

class Parts {
	private String chain;
	private int tire_size;
	public Parts(String chain, int tire_size) {
		this.chain = chain;
		this.tire_size = tire_size;
	}
}

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

public class BicycleWithParts {
	public static void main(String [] args) {
		Parts p = new Parts("part1", 10);
		Bicycle b = new Bicycle(12, p);
		b.spares();
	}
}