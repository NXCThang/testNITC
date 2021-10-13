package example.enumpack;

public enum Chucvu {
	BV ("Bảo vệ", 1),
	VS ("Vệ sinh", 2),
	GV ("Giảng viên", 3),
	SV ("Sinh viên", 4);
	
	public final String label;
	public int val;

	private Chucvu(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Chucvu nameOfValue (int val) {
		for (Chucvu i : values()) {
			if (i.val == val)
				return i;
		}
		return null;
	}
	public static String getCV(int val) {
		for (Chucvu e : values()) {      
			if(e.val == val)
				return e.label;
		}
		return null;
	}
}
