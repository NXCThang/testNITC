package example.MainProgram;

import java.util.List;
import java.util.Scanner;

import example.entity.Book;
import example.entity.Khoahoc;
import example.entity.Ngoaivan;
import example.entity.Vanhoc;
import example.singelton.Cart;
import example.singelton.Inventory;

public class MainProgram {
	public static void main(String[] args) {
		Inventory.addToInventory(new Khoahoc("Charles Darwin", 100000, 10, 2002));
		Inventory.addToInventory(new Khoahoc("Stephen Hawking", 80000, 8, 2010));
		Inventory.addToInventory(new Vanhoc("Tô Hoài", 20000, 5, 2));
		Inventory.addToInventory(new Vanhoc("Nam Cao", 15000, 4, 3));
		Inventory.addToInventory(new Ngoaivan("Jacob", 40000, 7, "9780192745293"));
		Inventory.addToInventory(new Ngoaivan("J. K. Rowling", 70000, 8, "0747532699"));
		
		List<Book> a =Inventory.getInstance();
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thêm sách vào kho: ");
		System.out.println("Số lần thêm vào: ");
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			int id, q;
			System.out.println("Nhập ID loại sách muốn thêm vào kho: ");
			id= scanner.nextInt();
			System.out.println("Nhập số lượng loại sách muốn thêm vào kho:");
			q = scanner.nextInt();
			Inventory.addQuantity(id, q);
		}
		
		System.out.println("1.Thông tin kho");
		System.out.println("2.Lấy sách vào giỏ");
		System.out.println("Bạn chọn: ");
		n = scanner.nextInt();
		if(n==1) {
			System.out.println("Danh sách sách trong kho: ");
			for(Book i:a ) {
				System.out.println(i.getId()+"  "+i.getName()+"  "+i.getPrice()+"  "+i.getQuantity());
			}
		}
		else if(n==2) {
			int d;
			System.out.println("Nhập số loại sách muốn bỏ vào giỏ hàng:");
			d=scanner.nextInt();
			for(int i=0;i<d;i++) {
				int id,q;
				System.out.println("Nhập ID của loại sách muốn thêm vào giỏ:");
				id = scanner.nextInt();
				System.out.println("Nhập số lượng của loại sách muốn thêm vào giỏ:");
				q = scanner.nextInt();
				System.out.println(Cart.addToCart(id, q));
			}
		}
	}
}
