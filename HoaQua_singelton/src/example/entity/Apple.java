package example.entity;

public class Apple extends Fruit {
	private int sugar;

	public Apple(String name, double price, int quantity,int sugar) {
		super(name, price, quantity);
		this.sugar = sugar;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
}
