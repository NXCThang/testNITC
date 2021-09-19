package QLHQ;

public class Thuoctinh {
	private String name;
	private int gia;
	private int q;
	public Thuoctinh(String name, int gia, int q) {
		this.name = name;
		this.gia = gia;
		this.q = q;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	
}
