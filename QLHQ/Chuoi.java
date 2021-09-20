package QLHQ;

public class Chuoi extends Thuoctinh{
	private int wK40;
	
	
	
	/**
	 * @param wK40
	 */
	public Chuoi(String name, int gia, int q, int wK40) {
		super(name,gia,q);
		this.wK40 = wK40;
	}

	public int getWK40() {
		return wK40;
	}

	public void setWK40(int wK40) {
		this.wK40 = wK40;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên quả: "+getName() + "|| Giá: "+ getGia() + "|| Số lượng: "+ getQ() + "|| khối lượng đồng vị kali 40: "+ getWK40();
	}
	
}
