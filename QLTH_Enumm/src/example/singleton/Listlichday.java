package example.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity2.Lichgiangday;

public class Listlichday {
	static private List<Lichgiangday> bangld = new ArrayList<Lichgiangday>();

	private Listlichday() {

	}

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
