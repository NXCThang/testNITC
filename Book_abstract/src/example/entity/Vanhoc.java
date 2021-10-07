package example.entity;

public class Vanhoc extends Book{
	private int taiban;
	
	public Vanhoc(String name, double price, int quantity,int taiban) {
		super(name, price, quantity);
		this.taiban=taiban;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getTaiban() {
		return taiban;
	}


	public void setTaiban(int taiban) {
		this.taiban = taiban;
	}


	@Override
	public void category() {
		System.out.println("Văn học");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" | Tên sách: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Tái bản lần thứ : "+getTaiban()+" | Thể loại sách: ";
	}
	
}
