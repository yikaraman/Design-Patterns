package org.developer.pattern.facade;

public class FacadeFactory {

	private static FacadeFactory instance = new FacadeFactory();

	public FacadeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static FacadeFactory instance() {
		
		return instance;
	}
	
	public ComponentFacade getFacade(){
		
		return new FacadeImpl();
	}
}
