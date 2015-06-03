package org.developer.pattern;

public class BMW extends CarFactory{

	@Override
	public void createAuto() {
		// TODO Auto-generated method stub
		getCarList().add(new Z4(140));
	}
}
