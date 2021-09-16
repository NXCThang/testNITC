package Quan_li_Truong_hoc;

import java.util.Scanner;

public class Hocsinh extends Thongtin{
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên học sinh: ");
		name = i.nextLine();
		System.out.println("Nhập tuổi của học sinh: ");
		age = i.nextInt();
		System.out.println("Nhập số CCCD của học sinh: ");
		cccd = i.nextLine();
	}
	
	public void output() {
		System.out.println("Tên học sinh là: "+ name);
		System.out.println("Tuổi của học sinh là: "+ age);
		System.out.println("Số CCCD của học sinh là: "+ cccd);
	}
}
