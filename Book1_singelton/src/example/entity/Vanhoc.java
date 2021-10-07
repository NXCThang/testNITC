package example.entity;

public class Vanhoc extends Book {
		private int taiban;

		/**
		 * @param name
		 * @param price
		 * @param quantity
		 * @param taiban
		 */
		public Vanhoc(String name, double price, int quantity, int taiban) {
			super(name, price, quantity);
			this.taiban = taiban;
		}

		public int getTaiban() {
			return taiban;
		}

		public void setTaiban(int taiban) {
			this.taiban = taiban;
		}
		
		
}
