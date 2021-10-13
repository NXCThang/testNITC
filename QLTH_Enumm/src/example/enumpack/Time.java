package example.enumpack;

public enum Time {
	TIET1 ("7h- 8h", 1),
	TIET2 ("8h10- 9h10", 2),
	TIET3 ("9h20- 10h20", 3),
	TIET4 ("10h30- 11h30", 4);

	public final String label;
	public int val;

	private Time(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Time NameOfValue (int val) {
		for (Time i: values()) {
			if (i.val == val) 
				return i;
		}
		return null;
	}
}
