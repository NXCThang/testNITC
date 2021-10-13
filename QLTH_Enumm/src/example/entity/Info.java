package example.entity;

import example.enumpack.Chucvu;
import example.enumpack.Gioitinh;

public abstract class Info {
	private int id;
	private String name;
	private int age;
	static private int count;
	
	public Info(String name,int age) {
		this.name=name;
		this.age=age;
		this.id=++count;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	abstract public Gioitinh gioitinh();
	abstract public Chucvu chucvu();
}
