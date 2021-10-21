package Model.entity;

import Model.enmuPack.Chucvu;
import Model.enmuPack.Gioitinh;
import Model.enmuPack.Type;

public class Sinhvien extends Info {
	private int gt;
	private int type;
	private int cv;
	
	public Sinhvien(String name, int age, int gt, int cv,int type) {
		super(name, age);
		this.gt = gt;
		this.type = type;
		this.cv=cv;
	}

	public Type getType() {
		Type x = Type.nameOfValue(type);
		return x;
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
				+ " | Chức vụ: " + Chucvu.getCV(4) + " | Loại: " + Type.getType(type);
	}

}
