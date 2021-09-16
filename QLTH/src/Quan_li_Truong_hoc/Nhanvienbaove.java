package Quan_li_Truong_hoc;

import java.util.Scanner;

public class Nhanvienbaove extends Thongtin {
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên nhân viên bảo vệ: ");
		name = i.nextLine();
		System.out.println("Nhập tuổi của nhân viên bảo vệ: ");
		age = i.nextInt();
		System.out.println("Nhập số CCCD của nhân viên bảo vệ: ");
		cccd = i.nextLine();
	}
	
	public void output() {
		System.out.println("Tên nhân viên bảo vệ là: "+ name);
		System.out.println("Tuổi của nhân viên bảo vệ là: "+ age);
		System.out.println("Số CCCD của nhân viên bảo vệ là: "+ cccd);
	}
}
