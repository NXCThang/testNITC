package example.entity2;

import example.enumpack.Time;
import example.enumpack.Vitri;

public class Lichtruc extends Lichlamviec{
	private int vitri;
	private int time;
	
	public Lichtruc(int id, int time,int vitri) {
		super(id);
		this.vitri=vitri;
		this.time=time;
	}

	@Override
	public String Time() {
		Time x=Time.NameOfValue(time);
		return x.label;
	}
	public String getVitri() {
		Vitri x= Vitri.nameOfValue(vitri);
		return x.s;
	}
	
}
