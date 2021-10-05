package example.singelton;

import java.util.ArrayList;
import java.util.List;

import example.entity.Fruit;

public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();
	
	private Inventory() {
		
	}
	
	static public List<Fruit> getInstance(){
		if(inventory == null) {
			inventory = new ArrayList<Fruit>();
		}
		return inventory; 
	}
	
	static public void addToInventory(Fruit fruit) {
		inventory.add(fruit);
	}
	
	static public boolean isValid(int id) {
		for(Fruit i : inventory ) {
			if(i.getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	static public Fruit getFruit(int id) {
		return inventory.get(id-1);
	}
	
	static public boolean addQuantity(int id, int quantity) {
		if(!Inventory.isValid(id)) {
			System.out.println("Không có loại quả này");
			return false;
		}else {
			Inventory.getFruit(id).addQuantity(quantity);
		}
		return true;
	}
}
