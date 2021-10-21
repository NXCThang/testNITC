package Controller.Utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int readInt(Scanner scanner,int min,int max) {
		while(true) {
			try {
				int a= Integer.parseInt(scanner.nextLine());
				if(a<min || a >max) {
					System.out.println("Bạn phải nhập số >= " + min+" và <= "+max);
					System.out.println("Nhập lại: ");
				}
				else return a;
			} catch (NumberFormatException ex) {
				System.out.println("Lỗi NumberFormatException");
				System.out.println("Nhập lại số nguyên");
			}
		}
	}
	
	public static String readString(Scanner scanner) {
		while(true) {
			try {
				while(true) {
					String s = scanner.nextLine();
					int kt=1;
					for(int i=0;i<s.length();i++) {
						if((s.charAt(i)-0>=97 && s.charAt(i)-0<=122) || (s.charAt(i)-0>=65 && s.charAt(i)-0<=90)) continue;
						else {
							System.out.println("Tên không được chưa kí tự đặc biệt");
							System.out.println("Nhập lại: ");
							kt=0;
							break;
						}
					}
					if(kt==1 && s!=null && !s.isEmpty()) return s;
				} 
			} catch (Exception ex) {
				System.out.println("Nhập lỗi");
				System.out.println("Nhập lại: ");
			}
		}
	}
}
