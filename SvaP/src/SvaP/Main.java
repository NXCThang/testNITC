package SvaP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("1.Hình vuông");
		System.out.println("2.Hình bình hành");
		System.out.println("3.Hình chữ nhật");
		System.out.println("4.Hình tam giác");
		System.out.println("Bạn chọn: ");
		n = scanner.nextInt();
		if(n==1) {
			Square hv = new Square();
			hv.input();
			hv.inP();
			hv.inS();
		}
		else if(n==2) {
			Parallelogram hbh = new Parallelogram();
			hbh.input();
			hbh.inP();
			hbh.inS();
		}
		else if(n==3) {
			Rectangle hcn = new Rectangle();
			hcn.input();
			hcn.inP();
			hcn.inS();
		}
		else if(n==4) {
			Triangle tg = new Triangle();
			tg.input();
			tg.inP();
			tg.inS();
		}
	}
}
