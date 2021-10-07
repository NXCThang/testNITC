package example.MainProgram;


import java.util.List;
import java.util.Scanner;

import example.entity.Apple;
import example.entity.Banana;
import example.entity.Fruit;
import example.entity.Orange;
import example.singleton.Cart;
import example.singleton.Inventory;

public class MainProgram {
	public static void main(String[] args) {
		Inventory.addToInventory(new Apple("Táo Mỹ", 60, 10, 20));
		Inventory.addToInventory(new Apple("Táo Tàu",50,1,10));
		Inventory.addToInventory(new Orange("Cam sành",70,7,20));
		Inventory.addToInventory(new Banana("Chuối Mỹ",50,15,0.01));
		Inventory.addToInventory(new Banana("Chuối tiêu",30,10,0.01));
		
		List<Fruit> a = Inventory.getInstance();
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thêm hoa quả vào kho: ");
		System.out.println("Số lần thêm vào: ");
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			int id, q;
			System.out.println("Nhập ID loại quả muốn thêm vào kho: ");
			id= scanner.nextInt();
			System.out.println("Nhập số lượng loại quả muốn thêm vào kho:");
			q = scanner.nextInt();
			Inventory.addQuantity(id, q);
		}
		
		System.out.println("1.Thông tin kho");
		System.out.println("2.Lấy hoa quả vào giỏ");
		System.out.println("Bạn chọn: ");
		n = scanner.nextInt();
		if(n==1) {
			System.out.println("Danh sách hoa quả trong kho:");
			for(Fruit i:a ) {
				System.out.print(i);
				i.vitamin();
			}
		}
		else if(n==2) {
			int d;
			System.out.println("Nhập số loại quả muốn bỏ vào giỏ hàng:");
			d=scanner.nextInt();
			for(int i=0;i<d;i++) {
				int id,q;
				System.out.println("Nhập ID của loại quả muốn thêm vào giỏ:");
				id = scanner.nextInt();
				System.out.println("Nhập số lượng của quả muốn thêm vào giỏ:");
				q = scanner.nextInt();
				System.out.println(Cart.addToCart(id, q));
			}
		}
	}
}
