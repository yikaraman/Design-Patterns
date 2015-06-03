package org.developer.pattern.AbstractFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory af = new ConcreteFactoryImpl();
		
		Apple elma = af.getApple();
		Pepper biber = af.getPepper();
		System.out.println(elma.type());
		System.out.println(biber.type());
		
	}

}
