package example.entity;

public class Khoahoc extends Book {
	private int xuatban;
	
	public Khoahoc(String name, double price, int quantity,int xuatban) {
		super(name, price, quantity);
		this.xuatban=xuatban;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getXuatban() {
		return xuatban;
	}


	public void setXuatban(int xuatban) {
		this.xuatban = xuatban;
	}
	
	@Override
	public void category() {
		System.out.println("Khoa học");
	}
	
	@Override
	public String toString() {
		return getId()+" | Tên sách: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Xuất bản lần thứ : "+getXuatban()+" | Thể loại sách: ";
	}
}
