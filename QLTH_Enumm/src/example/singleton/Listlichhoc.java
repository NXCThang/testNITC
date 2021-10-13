package example.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity2.Lichhoc;

public class Listlichhoc {
	static private List<Lichhoc> banglh = new ArrayList<Lichhoc>();

	private Listlichhoc() {

	}

	static public List<Lichhoc> getInstance() {
		if (banglh == null) {
			banglh = new ArrayList<Lichhoc>();
		}
		return banglh;
	}

	static public boolean addToBangld(Lichhoc lichlh) {
		banglh.add(lichlh);
		return true;
	}

	public static Lichhoc getId(int id) {
		for (Lichhoc i : banglh) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
