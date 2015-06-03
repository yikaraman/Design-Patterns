package org.developer.pattern.ObjectAdapter;

public class Adapter extends One_Class {

	public void TestMethod() {
		getAdaptee().MethodinAdapteeClass();
		getAdaptee().multiplybyNumbers();
	}

	private Adaptee adaptee = new Adaptee();

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
}
