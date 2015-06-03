package org.developer.patterns.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		HelloWorld service  = (HelloWorld) Naming.lookup("rmi://127.0.0.1/");
		
		System.out.println(service.hello());
		
	}
}
