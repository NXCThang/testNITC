package example.singleton;

import java.util.HashMap;
import java.util.Map;

import example.entity.Fruit;

public class Cart {
	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();
	
	private Cart() {
		
	}
	
	static public Map<Integer, Integer> getInstance(){
		return cart;
	}
	
	static public boolean addToCart(int id,int quantity) {
		if(Inventory.isValid(id)==false) {
			return false;
		}
		
		Fruit temp = Inventory.getFruit(id);
		if(temp.getQuantity()<quantity) {
			return false;
		}else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity-quantity);
		}
		if(cart.containsKey(id)) {
			int oldQuantity=cart.get(id);
			cart.put(id,oldQuantity+quantity);
		} else {
			cart.put(id, quantity);
		}
		return true;
	}
}
