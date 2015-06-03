package org.developer.pattern.builder;

public class Model {
	
	public Model(String model){
		setModel(model);
	}
	
	public String model;
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public String ToString(){
		return model;
	}

}
