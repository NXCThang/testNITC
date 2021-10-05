package example.entity;

public class Book {
	private int id;
	private String name;
	private double price;
	private int quantity;
	static private int count;
	
	public Book(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void addQuantity(int q) {
		this.quantity = this.quantity+q;
	}
}
