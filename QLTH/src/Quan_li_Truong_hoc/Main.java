package Quan_li_Truong_hoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,m;
		System.out.println("Nhập thông tin:");
		System.out.println("1.Giáo viên");
		System.out.println("2.Học sinh");
		System.out.println("3.Nhân viên bảo vệ");
		System.out.println("4.Nhân viên vệ sinh");
		System.out.println("Bạn chọn: ");
		n = scanner.nextInt();
		if(n==1) {
			System.out.println("Nhập số lượng giáo viên: ");
			m = scanner.nextInt();
			ArrayList<Giaovien> gv = new ArrayList<Giaovien>();
			for(int i=0;i<m;i++) {
				Giaovien g = new Giaovien();
				g.input();
				gv.add(g);
			}
			for(int i=0;i<m;i++) {
				System.out.println("Thông tin giáo viên thứ "+i+1);
				gv.get(i).output();
			}
		}
		else if(n==2) {
			System.out.println("Nhập số lượng học sinh: ");
			m = scanner.nextInt();
			ArrayList<Hocsinh> hs = new ArrayList<Hocsinh>();
			for(int i=0;i<m;i++) {
				Hocsinh h = new Hocsinh();
				h.input();
				hs.add(h);
			}
			for(int i=0;i<m;i++) {
				System.out.println("Thông tin học sinh thứ "+i+1);
				hs.get(i).output();
			}
		}
		else if(n==3) {
			System.out.println("Nhập số lượng nhân viên bảo vệ: ");
			m = scanner.nextInt();
			ArrayList<Nhanvienbaove> nvbv = new ArrayList<Nhanvienbaove>();
			for(int i=0;i<m;i++) {
				Nhanvienbaove bv = new Nhanvienbaove();
				bv.input();
				nvbv.add(bv);
			}
			for(int i=0;i<m;i++) {
				System.out.println("Thông tin nhân viên bảo vệ thứ "+i+1);
				nvbv.get(i).output();
			}
		}
		else if(n==4) {
			System.out.println("Nhập số lượng nhân viên vệ sinh: ");
			m = scanner.nextInt();
			ArrayList<Nhanvienvesinh> nvvs = new ArrayList<Nhanvienvesinh>();
			for(int i=0;i<m;i++) {
				Nhanvienvesinh vs = new Nhanvienvesinh();
				vs.input();
				nvvs.add(vs);
			}
			for(int i=0;i<m;i++) {
				System.out.println("Thông tin nhân viên vệ sinh thứ "+i+1);
				nvvs.get(i).output();
			}
		}
	}
}
