package Laptop;

public class Laptop {
	CPU cpu;
	Ram ram;
	Mainbroad mainbroad;
	Hang hang;
	int soLuong;
	/**
	 * @param cpu
	 * @param ram
	 * @param mainbroad
	 * @param hang
	 * @param soLuong
	 */
	public Laptop(CPU cpu, Ram ram, Mainbroad mainbroad, Hang hang, int soLuong) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.mainbroad = mainbroad;
		this.hang = hang;
		this.soLuong = soLuong;
	}
	public CPU getCpu() {
		return cpu;
	}
	public Ram getRam() {
		return ram;
	}
	public Mainbroad getMainbroad() {
		return mainbroad;
	}
	public Hang getHang() {
		return hang;
	}
	public int getSoLuong() {
		return soLuong;
	}
	
}
