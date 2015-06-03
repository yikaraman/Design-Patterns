package org.developer.pattern.builder;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager();
		manager.createOrder("Audi", "A5", "Black", 270);
		manager.printOrder();
		

	}

}
