package org.developer.pattern.Classadapter;

public class Adapter extends Adaptee implements One_interface {

	@Override
	public void AnMethod() {
		// TODO Auto-generated method stub
		AnotherMethod();
	}

	public int calculateSum() {
		return sum();
	}
}
