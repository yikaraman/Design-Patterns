package org.developer.pattern.ObjectAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One_Class one_Class = (One_Class) new Adapter();
		one_Class.TestMethod();
	}
}
