package Model.enmuPack;

public enum Type {
	CQ("Chính quy",1), 
	LT("Liên thông",2), 
	TC("Tại chức",3);

	public int value;
	public final String s;

	private Type(String s,int value) {
		this.value = value;
		this.s=s;
	}

	public static Type nameOfValue (int val) {
		for (Type i : values()) {
			if (i.value == val)
				return i;
		}
		return null;
	}
	public static String getType(int val) {
		for (Type i : values()) {      
			if(i.value == val)
				return i.s;
		}
		return null;
	}
}
