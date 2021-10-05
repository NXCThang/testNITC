package example.entity;

public class Ngoaivan extends Book {
	private String ISBN;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param iSBN
	 */
	public Ngoaivan(String name, double price, int quantity, String iSBN) {
		super(name, price, quantity);
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
