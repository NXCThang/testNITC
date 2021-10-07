package example.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity.Book;

public class Inventory {
	static private List<Book> inventory = new ArrayList<Book>();
	
	private Inventory() {
		
	}
	
	static public List<Book> getInstance(){
		if(inventory == null) {
			inventory = new ArrayList<Book>();
		}
		return inventory;
	}
	
	static public void addToInventory(Book book) {
		inventory.add(book);
	}
	
	static public boolean isValid(int id) {
		for(Book i : inventory) {
			if(i.getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	static public Book getBook(int id) {
		return inventory.get(id-1);
	}
	
	static public boolean addQuantity(int id, int quantity) {
		if(!Inventory.isValid(id)) {
			System.out.println("Không có loại sách này");
			return false;
		}else {
			Inventory.getBook(id).addQuantity(quantity);
		}
		return true;
	}
}
