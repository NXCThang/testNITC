package QLHQ;

public class Tao extends Thuoctinh{
	private int luongduong;
	public Tao(String name, int gia, int q, int luongduong) {
		super(name, gia, q);
		this.luongduong = luongduong;
	}
	public int getLuongduong() {
		return luongduong;
	}
	public void setLuongduong(int luongduong) {
		this.luongduong = luongduong;
	}

	public String toString() {
		return "Tên quả: "+getName() + "|| Giá: "+ getGia() + "|| Số lượng: "+ getQ() + "|| Lượng đường: "+ getLuongduong();
		
	}
}
