package example.entity;

public class Ngoaivan extends Book {
	private String ISBN;

	public Ngoaivan(String name, double price, int quantity,String ISBN) {
		super(name, price, quantity);
		this.ISBN=ISBN;
		// TODO Auto-generated constructor stub
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public void category() {
		// TODO Auto-generated method stub
		System.out.println("Ngoại văn");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" | Tên sách: "+ getName()+" | Gía: "+getPrice()+" | Số lượng: "+getQuantity()+ " | Mã ISBN : "+getISBN()+" | Thể loại sách: ";
	}
	
}
