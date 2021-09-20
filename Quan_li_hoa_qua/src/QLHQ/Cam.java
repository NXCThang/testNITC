package QLHQ;

public class Cam extends Thuoctinh {
	private int w;
	
	public Cam(String name, int gia, int q, int w) {
		super(name,gia,q);
		this.w = w;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên quả: "+getName() + "|| Giá: "+ getGia() + "|| Số lượng: "+ getQ() + "|| Cân nặng: "+ getW();
	}
}
