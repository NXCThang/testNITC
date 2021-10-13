package example.MainProgram;

import java.util.List;
import java.util.Scanner;

import example.entity.Nhanvien;
import example.entity.Sinhvien;
import example.entity2.Lichgiangday;
import example.entity2.Lichhoc;
import example.entity2.Lichtruc;
import example.singleton.DSNhanvien;
import example.singleton.DSSinhvien;
import example.singleton.Listlichday;
import example.singleton.Listlichhoc;
import example.singleton.Listlichtruc;

public class MainProgram {
	public static void main(String[] args) {
		DSSinhvien.addToDSSV(new Sinhvien("Thắng", 19, 1, 1));
		DSSinhvien.addToDSSV(new Sinhvien("Sơn", 19, 1, 1));
		DSSinhvien.addToDSSV(new Sinhvien("Minh", 19, 1, 1));
		DSSinhvien.addToDSSV(new Sinhvien("Trang", 18, 2, 2));
		List<Sinhvien> sv = DSSinhvien.getInstance();

		DSNhanvien.addToDSSV(new Nhanvien("Qua", 50, 1, 1));
		DSNhanvien.addToDSSV(new Nhanvien("Hùng", 60, 1, 1));
		DSNhanvien.addToDSSV(new Nhanvien("Hồng", 40, 2, 2));
		DSNhanvien.addToDSSV(new Nhanvien("Kiệt", 25, 1, 2));
		DSNhanvien.addToDSSV(new Nhanvien("Hoa", 30, 2, 3));
		DSNhanvien.addToDSSV(new Nhanvien("Dũng", 40, 1, 3));
		List<Nhanvien> nv = DSNhanvien.getInstance();

		Listlichhoc.addToBangld(new Lichhoc(1, 2, 3));
		Listlichhoc.addToBangld(new Lichhoc(2, 2, 2));
		List<Lichhoc> hoc = Listlichhoc.getInstance();
		
		Listlichtruc.addToBanglt(new Lichtruc(1, 1, 1));
		Listlichtruc.addToBanglt(new Lichtruc(2, 2, 2));
		Listlichtruc.addToBanglt(new Lichtruc(3, 3, 3));
		Listlichtruc.addToBanglt(new Lichtruc(4, 3, 3));
		List<Lichtruc> truc = Listlichtruc.getInstance();

		Listlichday.addToBangld(new Lichgiangday(5, 2, 3));
		Listlichday.addToBangld(new Lichgiangday(6, 3, 4));
		List<Lichgiangday> day = Listlichday.getInstance();

		System.out.println("1.In thông tin");
		System.out.println("2.In lịch ");
		System.out.println("Bạn chọn: ");
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		x = scanner.nextInt();
		if (x == 1) {
			System.out.println("1.Sinh viên");
			System.out.println("2.Nhân viên");
			System.out.println("Bạn chọn: ");
			y = scanner.nextInt();
			if (y == 1) {
				for (Sinhvien i : sv) {
					System.out.println(i);
				}
			} else if (y == 2) {
				for (Nhanvien i : nv) {
					System.out.println(i);
				}
			}
		}
		if (x == 2) {
			System.out.println("1.Sinh viên");
			System.out.println("2.Nhân viên");
			System.out.println("3.Giảng viên");
			System.out.println("Bạn chọn: ");
			y = scanner.nextInt();
			if (y == 1) {
				System.out.println("Nhập id: ");
				z = scanner.nextInt();
				if (DSSinhvien.isValid(z))
					System.out.println("Tên: " + DSSinhvien.getId(z));
				if (Listlichhoc.getId(z) != null)
					System.out.println("Phòng: " + Listlichhoc.getId(z).getPhong() + " | Thời gian: "
							+ Listlichhoc.getId(z).Time());
			}
			else if(y==3) {
				System.out.println("Nhập id: ");
				z = Integer.parseInt(scanner.nextLine());
				if (DSNhanvien.isValid(z))
					System.out.println("Tên: " + DSNhanvien.getId(z));
				if (Listlichday.getId(z)!=null)
					System.out.println("Phòng: " + Listlichday.getId(z).getPhong() + " | Thời gian: "
							+ Listlichday.getId(z).Time());
			}
			else if(y==2) {
				System.out.println("Nhập id: ");
				z = scanner.nextInt();
				if (DSNhanvien.isValid(z))
					System.out.println("Tên: " + DSNhanvien.getId(z));
				if (Listlichtruc.getId(z) != null)
					System.out.println("Vị trí: " + Listlichtruc.getId(z).getVitri() + " | Thời gian: "
							+ Listlichtruc.getId(z).Time());
			}
		}
	}
}
