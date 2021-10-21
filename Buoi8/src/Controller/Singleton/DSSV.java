package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.Sinhvien;

public class DSSV {
static private List<Sinhvien> dssv= new ArrayList<Sinhvien>();
	
	private DSSV() {
	
	}
	
	static public List<Sinhvien> getInstance(){
		if(dssv==null) {
			dssv = new ArrayList<Sinhvien>();
		}
		return dssv;
	}
	
	static public boolean addToDSSV(Sinhvien sv) {
		dssv.add(sv);
		return true;
	}
	
	static public boolean isValid(int id) {
		for(Sinhvien i: dssv) {
			if(i.getId()==id) return true;
		}
		return false;
	}
	static public String getId(int id) {
		for(Sinhvien i : dssv) {
			if(i.getId()==id) return i.getName();
		}
		return null;
	}
}
