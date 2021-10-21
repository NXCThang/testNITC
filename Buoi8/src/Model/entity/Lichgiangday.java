package Model.entity;

import Model.enmuPack.Phonghoc;
import Model.enmuPack.Time;

public class Lichgiangday extends Lichlamviec {
	private int phong;
	private int time;
	
	public Lichgiangday(int id,int time,int phong) {
		super(id);
		this.phong=phong;
		this.time=time;
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
		Time x= Time.nameOfValue(time);
		return x.label;
	}
	
}
