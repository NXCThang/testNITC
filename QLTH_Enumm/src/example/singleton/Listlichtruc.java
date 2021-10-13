package example.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity2.Lichtruc;

public class Listlichtruc {
	static private List<Lichtruc> banglt = new ArrayList<Lichtruc>();

	private Listlichtruc() {

	}

	static public List<Lichtruc> getInstance() {
		if (banglt == null) {
			banglt = new ArrayList<Lichtruc>();
		}
		return banglt;
	}

	static public boolean addToBanglt(Lichtruc lt) {
		banglt.add(lt);
		return true;
	}

	public static Lichtruc getId(int id) {
		for (Lichtruc i : banglt) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
