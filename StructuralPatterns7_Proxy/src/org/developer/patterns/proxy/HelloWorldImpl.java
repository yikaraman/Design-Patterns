package org.developer.patterns.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {

	private static final long serialVersionUID = 3189705112317036107L;

	protected HelloWorldImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
