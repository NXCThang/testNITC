package example.entity2;

public abstract class Lichlamviec {
	private int id;
	static private int count=0;
	
	public Lichlamviec(int id) {
		super();
		this.id=++count;
	}
	
	public int getId() {
		return id;
	}
	public abstract String Time();
}
