package org.developer.patterns.proxy;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface HelloWorld extends Remote{
	
	public String hello() throws RemoteException;

}
