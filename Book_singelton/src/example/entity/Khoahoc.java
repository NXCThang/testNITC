package example.entity;

public class Khoahoc extends Book {
	private int xuatban;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param xuatban
	 */
	public Khoahoc(String name, double price, int quantity, int xuatban) {
		super(name, price, quantity);
		this.xuatban = xuatban;
	}

	public int getXuatban() {
		return xuatban;
	}

	public void setXuatban(int xuatban) {
		this.xuatban = xuatban;
	}
	
	
}
