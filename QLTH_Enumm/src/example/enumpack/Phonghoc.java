package example.enumpack;

public enum Phonghoc {
	A101("A101",1),
	B202("B202",2),
	C303("C303",3),
	D404("D404",4);

	public final String label;
	public int val;

	private Phonghoc(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Phonghoc nameOfValue (int val) {
		for (Phonghoc i : values()) {
			if (i.val == val)
				return i;
		}
		return null;
	}
}
