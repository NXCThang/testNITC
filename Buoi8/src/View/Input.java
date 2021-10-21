package View;

import java.util.Scanner;

import Controller.Singleton.DSGV;
import Controller.Singleton.DSNV;
import Controller.Singleton.DSSV;
import Controller.Utils.ScannerUtils;
import Model.enmuPack.Chucvu;
import Model.enmuPack.Gioitinh;
import Model.enmuPack.Phonghoc;
import Model.enmuPack.Time;
import Model.enmuPack.Vitri;
import Model.entity.Giangvien;
import Model.entity.Nhanvien;
import Model.entity.Sinhvien;

public class Input {
	static Scanner scanner = new Scanner(System.in);
	
	static public void Nhapthongtin() {
		System.out.println("Nhập tên: ");
		String name = ScannerUtils.readString(scanner);
		System.out.println("Nhập tuổi: ");
		int age = ScannerUtils.readInt(scanner, 18, 100);
		Menu.Gioitinh();
		int gt = ScannerUtils.readInt(scanner, 1, 3);
		String gioitinh = Gioitinh.getGT(gt);
		Menu.Chucvu();
		int cv = ScannerUtils.readInt(scanner, 1, 4);
		String chucvu= Chucvu.getCV(cv);
		
		if(cv==4) {
			System.out.println("Loại đào tạo: ");
			Menu.type();
			int type = ScannerUtils.readInt(scanner, 1, 4);
			DSSV.addToDSSV(new Sinhvien(name, age, gt,cv, type));
		} else if(cv==3) {
			DSGV.addToDSSV(new Giangvien(name, age, gt,cv));
		} else DSNV.addToDSSV(new Nhanvien(name, age, gt, cv));
		
	}
	
	public static void Nhaplichday() {
		System.out.println("Nhập thời gian cần thêm vào lịch dạy: ");
		int tg = ScannerUtils.readInt(scanner, 1, 4);
		Time time = Time.nameOfValue(tg);
		System.out.println("Nhập phòng học cần thêm vào lịch dạy: ");
		int ph = ScannerUtils.readInt(scanner, 1, 4);
		Phonghoc phonghoc = Phonghoc.nameOfValue(ph);
	}
	
	public static void Nhaplichhoc() {
		System.out.println("Nhập thời gian cần thêm vào lịch học: ");
		int tg = ScannerUtils.readInt(scanner, 1, 4);
		Time time = Time.nameOfValue(tg);
		System.out.println("Nhập phòng học cần thêm vào lịch học: ");
		int ph = ScannerUtils.readInt(scanner, 1, 4);
		Phonghoc phonghoc = Phonghoc.nameOfValue(ph);
	}
	
	public static void Nhaplichtruc() {
		System.out.println("Nhập thời gian cần thêm vào lịch trực: ");
		int tg = ScannerUtils.readInt(scanner, 1, 4);
		System.out.println("Nhập vị trị cần thêm vào lịch trực: ");
		int vt = ScannerUtils.readInt(scanner, 1, 7);
		Vitri vitri = Vitri.nameOfValue(vt);
	}
	static public void Nhapbanglichcanthem() {
		System.out.println("Thêm vào bảng ");
		Menu.lịch();
		System.out.println("Chọn: ");
		int x = ScannerUtils.readInt(scanner, 1, 3);
		if(x==1) Input.Nhaplichhoc();
		else if(x==2) Input.Nhaplichday();
		else Input.Nhaplichtruc();
	}
}
