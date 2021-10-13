package example.entity;

import example.enumpack.Chucvu;
import example.enumpack.Gioitinh;
import example.enumpack.Type;

public class Sinhvien extends Info {

	private int gt;
	private int type;

	public Sinhvien(String name, int age, int gt, int type) {
		super(name, age);
		this.gt = gt;
		this.type = type;
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
		Chucvu x = Chucvu.nameOfValue(4);
		return x;
	}

	@Override
	public String toString() {
		return getId() + " | Tên: " + getName() + " | Tuổi: " + getAge() + " | Giới tính: " + Gioitinh.getGT(gt)
				+ " | Chức vụ: " + Chucvu.getCV(4) + " | Loại: " + Type.getType(type);
	}

}
