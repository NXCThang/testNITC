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

	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin B6");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" | Tên loại quả: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Khối lượng đồng vị kali 40: "+getKali()+" | Vitamin: ";
	}
}