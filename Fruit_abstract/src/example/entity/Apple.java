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

	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin A");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" | Tên loại quả: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Lượng đường: "+getSugar()+" | Vitamin: ";
	}
	
}
