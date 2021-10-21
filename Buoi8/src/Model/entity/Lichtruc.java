package Model.entity;

import Model.enmuPack.Time;
import Model.enmuPack.Vitri;

public class Lichtruc extends Lichlamviec {
	private int vitri;
	private int time;
	
	public Lichtruc(int id,int time, int vitri) {
		super(id);
		this.vitri=vitri;
		this.time=time;
	}

	@Override
	public String Time() {
		Time x=Time.nameOfValue(time);
		return x.label;
	}
	public String getVitri() {
		Vitri x= Vitri.nameOfValue(vitri);
		return x.s;
	}

}	
