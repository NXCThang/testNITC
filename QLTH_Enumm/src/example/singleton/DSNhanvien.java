package example.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity.Nhanvien;

public class DSNhanvien {
	static private List<Nhanvien> dsnv= new ArrayList<Nhanvien>();
	
	private DSNhanvien() {
	
	}
	
	static public List<Nhanvien> getInstance(){
		if(dsnv==null) {
			dsnv = new ArrayList<Nhanvien>();
		}
		return dsnv;
	}
	
	static public boolean addToDSSV(Nhanvien nhanvien) {
		dsnv.add(nhanvien);
		return true;
	}
	
	public static boolean isValid(int id){
		for(Nhanvien i : dsnv) {
			if(i.getId()==id){
				return true;
			}
		}
		return false;
	}
	static public String getId(int id) {
		for(Nhanvien i: dsnv) {
			if(i.getId()==id) return i.getName();
		}
		return null;
	}
}
