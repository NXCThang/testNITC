package PC;

public class PC {
	CPU cpu;
	Ram ram;
	Mainbroad mainbroad;
	int soLuong;
	ID id; 
	/**
	 * @param cpu
	 * @param ram
	 * @param mainbroad
	 * @param hang
	 * @param soLuong
	 */
	public PC(CPU cpu, Ram ram, Mainbroad mainbroad,ID id, int soLuong) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.mainbroad = mainbroad;
		this.id = id;
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
	public int getSoLuong() {
		return soLuong;
	}
	public ID getID() {
		return id;
	}
}
