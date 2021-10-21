package Model.entity;

import Model.enmuPack.Chucvu;
import Model.enmuPack.Gioitinh;

public class Giangvien extends Info{
	private int gt;
	private int cv;
	public Giangvien(String name, int age, int gt,int cv) {
		super(name, age);
		this.gt = gt;
		this.cv= cv;
	}
	
	public Gioitinh gioitinh() {
		Gioitinh x = Gioitinh.nameOfValue(gt);
		return x;
	}

	@Override
	public Chucvu chucvu() {
		Chucvu x = Chucvu.nameOfValue(cv);
		return x;
	}

	@Override
	public String toString() {
		return getId() + " | Tên: " + getName() + " | Tuổi: " + getAge() + " | Giới tính: " + Gioitinh.getGT(gt)
				+ " | Chức vụ: " + Chucvu.getCV(3);
	}
}	
