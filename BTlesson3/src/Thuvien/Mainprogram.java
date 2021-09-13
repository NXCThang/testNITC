package Thuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainprogram {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<Sach> S = new ArrayList<Sach>();
		int n;
		System.out.println("Nhập số loại sách: ");
		n = i.nextInt();
		for(int j=0;j<n;j++) {
			Sach s= new Sach();
			s.input();
			S.add(s);
		}
		
		for(int j=0;j<n;j++) {
			S.get(j).output();
		}
	}
}
