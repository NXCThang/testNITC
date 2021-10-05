package example.entity;

public class Banana extends Fruit {
	private double kali;
	
	public Banana(String name, double price, int quantity,double kali) {
		super(name, price, quantity);
		this.kali = kali;
	}

	public double getKali() {
		return kali;
	}

	public void setKali(double kali) {
		this.kali = kali;
	}	
}
