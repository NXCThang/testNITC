package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.Lichhoc;

public class Banglichhoc {
	public static List<Lichhoc> listlichhoc = new ArrayList<Lichhoc>();
	
	static public List<Lichhoc> getInstance() {
		if (listlichhoc == null) {
			listlichhoc = new ArrayList<Lichhoc>();
		}
		return listlichhoc;
	}
	
	public static boolean addToLichhoc(Lichhoc h) {
		listlichhoc.add(h);
		return true;
	}
	
	public static Lichhoc getId(int id) {
		for (Lichhoc i : listlichhoc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
