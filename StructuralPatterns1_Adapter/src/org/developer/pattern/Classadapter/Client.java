package org.developer.pattern.Classadapter;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		One_interface anInterface = new Adapter();
		anInterface.AnMethod();
		System.out.println(anInterface.calculateSum());
	}
}
