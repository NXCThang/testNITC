package Quan_li_Truong_hoc;

import java.util.Scanner;

public class Giaovien extends Thongtin{
	String bomon;
	
	public Giaovien() {
		super();
	}
	
	public Giaovien(String bomon) {
		super();
		this.bomon = bomon;
	}

	public String getBomon() {
		return bomon;
	}

	public void setBomon(String bomon) {
		this.bomon = bomon;
	}
	
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên giáo viên: ");
		name = i.nextLine();
		System.out.println("Nhập tuổi của giáo viên: ");
		age = Integer.parseInt(i.nextLine());
		System.out.println("Nhập số CCCD của giáo viên: ");
		cccd = i.nextLine();
		System.out.println("Nhập tên bộ môn giảng dạy: ");
		bomon = i.nextLine();
	}
	
	public void output() {
		System.out.println("Tên giáo viên là: "+ name);
		System.out.println("Tuổi của giáo viên là: "+ age);
		System.out.println("Số CCCD của giáo viên là: "+ cccd);
		System.out.println("Bộ môn giảng dạy: "+bomon);
	}
}
