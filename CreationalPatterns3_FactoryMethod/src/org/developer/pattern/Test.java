package org.developer.pattern;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory bmw = new BMW();
		
		for (car car :bmw.getCarList()) {
			System.out.println(car.getLabel() + " " + car.getModel() + " ," + car.getPower());	
		}
	}
}
