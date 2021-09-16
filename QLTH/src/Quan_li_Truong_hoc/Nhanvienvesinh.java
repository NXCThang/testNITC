package Quan_li_Truong_hoc;

import java.util.Scanner;

public class Nhanvienvesinh extends Thongtin{
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên nhân viên vệ sinh: ");
		name = i.nextLine();
		System.out.println("Nhập tuổi của nhân viên vệ sinh: ");
		age = i.nextInt();
		System.out.println("Nhập số CCCD của nhân viên vệ sinh: ");
		cccd = i.nextLine();
	}
	
	public void output() {
		System.out.println("Tên nhân viên vệ sinh là: "+ name);
		System.out.println("Tuổi của nhân viên vệ sinh là: "+ age);
		System.out.println("Số CCCD của nhân viên vệ sinh là: "+ cccd);
	}
}
