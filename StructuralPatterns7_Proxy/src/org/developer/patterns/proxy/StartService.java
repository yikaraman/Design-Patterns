package org.developer.patterns.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class StartService {
	
	public static void main(String[] args) {
		try {
			HelloWorld hw = new HelloWorldImpl();
			Naming.rebind("Hello World", hw);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
