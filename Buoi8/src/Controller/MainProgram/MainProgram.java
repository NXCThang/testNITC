package Controller.MainProgram;

import java.util.Scanner;

import Controller.Utils.ScannerUtils;
import View.Input;
import View.Output;

public class MainProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nhân sự: ");
		int n = ScannerUtils.readInt(scanner, 1, 10000);
		for(int i=1;i<=n;i++) {
			System.out.println("Nhập thông tin nhân sự: ");
			Input.Nhapthongtin();
		}
		
		System.out.println("Thêm lịch ");
		Input.Nhapbanglichcanthem();
		
		System.out.println("1. Xem thông tin nhân sự:");
		System.out.println("2. Xem lịch làm việc");
		System.out.println("Bạn chọn: ");
		int c = ScannerUtils.readInt(scanner, 1, 2);
		if(c==1) Output.In_info();
		else Output.In_lich();
	}
}
