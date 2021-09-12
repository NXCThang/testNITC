package Thuvien;

import java.util.Scanner;

public class Dachomuon {
	private String name;
	private String tacgia;
	private int soluong;
	
	public Dachomuon(){
		super();
	}
	public Dachomuon(String name, String tacgia, int soluong) {
		super();
		this.name = name;
		this.tacgia = tacgia;
		this.soluong = soluong;
	}
	
	public String getName() {
		return name;
	}
	public String getTacgia() {
		return tacgia;
	}
	public int getSoluong() {
		return soluong;
	}
	
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên sách: ");
		name = i.nextLine();
		System.out.println("Nhập tên tác giả: ");
		tacgia = i.nextLine();
		System.out.println("Nhập số lượng cuốn sách này: ");
		soluong = i.nextInt();
	}
	
	public void output() {
		System.out.println("Tên: "+ name);
		System.out.println("Tác giả: "+ tacgia);
		System.out.println("Số lượng: "+soluong);
	}
}
