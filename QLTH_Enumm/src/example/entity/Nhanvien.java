package example.entity;

import example.enumpack.Chucvu;
import example.enumpack.Gioitinh;

public class Nhanvien extends Info {
	
	private int gt;
	private int cv;
	
	public Nhanvien(String name, int age,int gt,int cv) {
		super(name, age);
		this.cv=cv;
		this.gt=gt;
	}

	public Gioitinh gioitinh() {
		Gioitinh x= Gioitinh.nameOfValue(gt);
		return x;
	}

	@Override
	public Chucvu chucvu() {
		Chucvu x= Chucvu.nameOfValue(cv);
		return x;
	}
	@Override
	public String toString() {
		return getId() + " | Tên: " + getName() + " | Tuổi: " + getAge() + " | Giới tính: " + gioitinh()
		+ " | Chức vụ: " + chucvu();
	}
}
	
