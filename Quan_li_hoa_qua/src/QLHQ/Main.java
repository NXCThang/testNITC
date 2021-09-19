package QLHQ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<Thuoctinh> list_tt = new ArrayList<Thuoctinh>();
		list_tt.add(new Tao("Táo đỏ", 1000, 1, 20));
		list_tt.add(new Tao("Táo đen", 2000, 3, 30));
		list_tt.add(new Cam("Cam sành", 3000, 4, 2));
		list_tt.add(new Cam("Cam canh", 2000, 10, 1));
		list_tt.add(new Chuoi("Chuối tiêu", 2000, 5, 10));
		list_tt.add(new Chuoi("Chuối hột", 1500, 10, 20));
		
		System.out.println("1.In ra thông tin 3 loại hoa quả");
		System.out.println("2.Nhập vào số tiền vào và tìm ra số lượng mỗi loại hoa quả có thể mua nhiều nhất");
		System.out.println("Bạn chọn: ");
		int a= i.nextInt();
		if(a==1) {
			for(Thuoctinh it : list_tt)
				System.out.println(it.toString());
		}
		else {
			System.out.println("Nhập số tiền: ");
			int t = i.nextInt();
			for(Thuoctinh it : list_tt) {
				if(it.getGia()<=t) {
					int dem =0;
					int t1=t;
					while(t1>=0) {
						t1= t1-it.getGia();
						dem++;
						if(dem>it.getQ()) {
							System.out.println(it.getName()+" có thể mua tối đa là: "+ it.getQ() + " quả");
							break;
						}
					}
					if(dem-1<it.getQ()) System.out.println(it.getName()+" có thể mua tối đa là: "+ (dem-1) + " quả");
				}
			}
		}
	}
}
