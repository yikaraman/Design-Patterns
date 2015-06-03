package org.developer.pattern.builder;

public class Label {
	
	public Label(String label){
		setLabel(label);
	}

	public String label;
	
	public String getLabel(){
		return label;
	}
	
	public void setLabel(String label){
		this.label=label;
	}
	
	public String ToString(){
		return label;
	}
}
