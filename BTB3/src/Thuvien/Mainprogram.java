package Thuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainprogram {
	public static void main(String[] args) {
		ArrayList<Trongkho> TK = new ArrayList<Trongkho>();
		int a;
		Trongkho tk;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số loại sách trong kho: ");
		a = scanner.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Nhập thông tin quyển sách thứ "+(i+1)+ ": ");
			tk = new Trongkho();
			tk.input();
			TK.add(tk);
		}
		
		ArrayList<Trungbay> TB = new ArrayList<Trungbay>();
		int b;
		Trungbay tb;
		System.out.println("Nhập số loại sách trưng bày: ");
		b = scanner.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println("Nhập thông tin quyển sách thứ "+(i+1)+ ": ");
			tb = new Trungbay();
			tb.input();
			TB.add(tb);
		}
		
		ArrayList<Dachomuon> M = new ArrayList<Dachomuon>();
		int c;
		Dachomuon m;
		System.out.println("Nhập số loại sách đã cho mượn: ");
		c = scanner.nextInt();
		for(int i=0;i<c;i++) {
			System.out.println("Nhập thông tin quyển sách thứ "+(i+1)+ ": ");
			m = new Dachomuon();
			m.input();
			M.add(m);
		}
		System.out.println("Thông tin các sách trong kho: ");
		for(int i=0;i<a;i++) {
			TK.get(i).output();
		}
		
		System.out.println("Thông tin các sách trưng bày: ");
		for(int i=0;i<b;i++) {
			TB.get(i).output();
		}
		
		System.out.println("Thông tin các sách đã cho mượn: ");
		for(int i=0;i<c;i++) {
			M.get(i).output();
		}
	}
}
