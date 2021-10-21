package Model.enmuPack;

public enum Gioitinh {
	NAM("Nam", 1),
	NU("Nữ", 2),
	KHAC("Khác", 3);

	public final String label;
	public int val;

	private Gioitinh(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Gioitinh nameOfValue (int val) {
		for (Gioitinh e : values()) {      
			if(e.val == val)
				return e;
		}
		return null;
	}
	public static String getGT(int val) {
		for (Gioitinh e : values()) {      
			if(e.val == val)
				return e.label;
		}
		return null;
	}
}
