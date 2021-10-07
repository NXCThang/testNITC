package example.entity;

public class Orange extends Fruit {
	private int weight;
	
	public Orange(String name, double price, int quantity,int weight) {
		super(name, price, quantity);
		this.weight= weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin C");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" | Tên loại quả: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Cân năng: "+getWeight()+" | Vitamin: ";
	}
	
}
