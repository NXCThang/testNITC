package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.Giangvien;

public class DSGV {
	static private List<Giangvien> dsgv = new ArrayList<Giangvien>();

	private DSGV() {
	
	}

	static public List<Giangvien> getInstance() {
		if (dsgv == null) {
			dsgv = new ArrayList<Giangvien>();
		}
		return dsgv;
	}

	static public boolean addToDSSV(Giangvien gv) {
		dsgv.add(gv);
		return true;
	}

	public static boolean isValid(int id) {
		for (Model.entity.Giangvien i : dsgv) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}
}
