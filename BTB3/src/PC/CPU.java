package PC;

public class CPU {
	private String name;
	private ID id;
	
	public CPU(String name, ID id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public ID getID() {
		return id;
	}
}