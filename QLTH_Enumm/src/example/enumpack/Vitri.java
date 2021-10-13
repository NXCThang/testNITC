package example.enumpack;

public enum Vitri {
	Tang1("Tầng 1",1), 
	Tang2("Tầng 2",2),
	Tang3("Tầng 3",3),
	Congbaove("Cổng bảo vệ",4),
	WCtang1("WC tầng 1",5),
	WCtang2("WC tầng 2",6),
	WCtang3("WC tầng 3",7);
	
	public final int v;
	public final String s;
	
	private Vitri(String s,int v) {
		this.s=s;
		this.v=v;
	}
	
	public static Vitri nameOfValue (int val) {
		for (Vitri i : values()) {
			if (i.v == val)
				return i;
		}
		return null;
	}
}
