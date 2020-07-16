package practiceJava;

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

public class LeveregingPartFactory {
	public static void main(String [] args) {
		PartsFactory pf = new PartsFactory("chain", "10-speed", true);
		pf.spares();
	}
}