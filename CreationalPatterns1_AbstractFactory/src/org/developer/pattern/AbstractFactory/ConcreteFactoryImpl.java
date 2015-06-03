package org.developer.pattern.AbstractFactory;

public class ConcreteFactoryImpl implements AbstractFactory {

	@Override
	public Apple getApple() {
		// TODO Auto-generated method stub
		return new RedApple();
	}

	@Override
	public Pepper getPepper() {
		// TODO Auto-generated method stub
		return new GreenPepper();
	}

}
