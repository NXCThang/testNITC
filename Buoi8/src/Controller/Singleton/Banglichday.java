package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.Lichgiangday;

public class Banglichday {
	static private List<Lichgiangday> bangld = new ArrayList<Lichgiangday>();

	static public List<Lichgiangday> getInstance() {
		if (bangld == null) {
			bangld = new ArrayList<Lichgiangday>();
		}
		return bangld;
	}

	static public boolean addToBangld(Lichgiangday lichgd) {
		bangld.add(lichgd);
		return true;
	}
	static public Lichgiangday getId(int id) {
		for (Lichgiangday i : bangld) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
