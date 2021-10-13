package example.entity2;

import example.enumpack.Phonghoc;
import example.enumpack.Time;

public class Lichgiangday extends Lichlamviec{
	private int phong;
	private int time;
	
	public Lichgiangday(int id, int time,int phong) {
		super(id);
		this.time=time;
		this.phong=phong;
	}
	
	public String getPhong() {
		Phonghoc x= Phonghoc.nameOfValue(phong);
		return x.label;
	}
	
	public void setPhong(int phong) {
		this.phong=phong;
	}

	@Override
	public String Time() {
		Time x= Time.NameOfValue(time);
		return x.label;
	}
	
}
