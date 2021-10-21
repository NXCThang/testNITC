package Model.entity;

public abstract class Lichlamviec {
	private int id;
	
	public Lichlamviec(int id) {
		super();
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract String Time();
}
