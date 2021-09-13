package Thuvien;

import java.util.Scanner;

public class Sach {
	private String name;
	private Tacgia tacgia;
	private String trangthai;
	private int soluong;
	
	public Sach() {
		super();
	}
	
	public Sach(String name, Tacgia tacgia, String trangthai, int soluong) {
		super();
		this.name = name;
		this.tacgia = tacgia;
		this.trangthai=trangthai;
		this.soluong = soluong;
	}
	
	public String getName() {
		return name;
	}
	public Tacgia getTacgia() {
		return tacgia;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public int getSoluong() {
		return soluong;
	}
	
	public void input() {
		Scanner i = new Scanner(System.in);
		System.out.println("Nhập tên sách: ");
		this.name = i.nextLine();
		System.out.println("Nhập tên tác giả: ");
		this.tacgia = new Tacgia(i.nextLine());
		System.out.println("Trạng thái: ");
		this.trangthai = i.nextLine();
		System.out.println("Nhập số lượng: ");
		this.soluong = i.nextInt();
	}
	
	public void output() {
		System.out.println("Tên: "+ name);
		System.out.println("Tác giả: "+ tacgia);
		System.out.println("Trạng thái: "+trangthai);
		System.out.println("Số lượng: "+soluong);
	}
}
