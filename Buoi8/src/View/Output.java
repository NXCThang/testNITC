package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Singleton.Banglichday;
import Controller.Singleton.Banglichhoc;
import Controller.Singleton.Banglichtruc;
import Controller.Utils.ScannerUtils;
import Model.entity.Giangvien;
import Model.entity.Lichgiangday;
import Model.entity.Lichhoc;
import Model.entity.Lichtruc;
import Model.entity.Nhanvien;
import Model.entity.Sinhvien;
public class Output {
	static Scanner scanner = new Scanner(System.in);
	
	static List<Sinhvien> sv = new ArrayList<Sinhvien>();
	static List<Giangvien> gv = new ArrayList<Giangvien>();
	static List<Nhanvien> nv = new ArrayList<Nhanvien>();
	
	static List<Lichgiangday> lichgv = new ArrayList<Lichgiangday>();
	static List<Lichhoc> lichsv = new ArrayList<Lichhoc>();
	static List<Lichtruc> lichnv = new ArrayList<Lichtruc>();
	
	public static void In_info() {
		Menu.info();
		System.out.println("Chọn: ");
		int n = ScannerUtils.readInt(scanner, 1, 3);
		if(n==1) Output.In_SV();
		else if(n==2) Output.In_GV();
		else Output.In_NV();
	}
	
	public static void In_SV() {
		for(Sinhvien i : sv) System.out.println(i);
	}
	
	public static void In_GV() {
		for(Giangvien i: gv) System.out.println(i);
	}
	
	public static void In_NV() {
		for(Nhanvien i: nv) System.out.println(i);
	}
	
	public static void In_lich() {
		System.out.println("In ");
		Menu.lịch();
		System.out.println("Chọn: ");
		int n1 = ScannerUtils.readInt(scanner, 1, 3);
		if(n1==1) {
			int id = ScannerUtils.readInt(scanner, 1, 100);
			if(Banglichhoc.getId(id)!=null) {
				System.out.println("Phòng: "+ Banglichhoc.getId(id).getPhong()+ " | Thời gian: "+ Banglichhoc.getId(id).Time());
			} else System.out.println("Chưa có lịch nào");
		} else if(n1==2) {
			int id = ScannerUtils.readInt(scanner, 1, 100);
			if(Banglichday.getId(id)!=null) {
				System.out.println("Phòng: " +Banglichday.getId(id).getPhong()+ " | Thời gian: "+ Banglichday.getId(id).Time());
			}else System.out.println("Chưa có lịch nào");
		} else {
			int id = ScannerUtils.readInt(scanner, 1, 100);
			if(Banglichtruc.getId(id)!=null) {
				System.out.println("Vị trí: "+ Banglichtruc.getId(id).getVitri()+" | Thời gian: "+ Banglichtruc.getId(id).Time());
			} else System.out.println("Chưa có lịch nào");
		}
	}
}
