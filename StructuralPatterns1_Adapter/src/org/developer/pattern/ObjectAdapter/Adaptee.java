package org.developer.pattern.ObjectAdapter;

public class Adaptee {

	public void MethodinAdapteeClass() {
		System.out.println("Method in Adaptee Class");
	}

	public void multiplybyNumbers() {
		int a = 7;
		int b = 10;
		System.out.println( a * b);
	}
}
