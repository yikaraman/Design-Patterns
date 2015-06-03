package org.developer.pattern.builder;

public class Audi extends Builder {
	
	public Audi(){
		
	}


	public void setLabel(String label) {
		// TODO Auto-generated method stub
		getCar().setLabel(new Label(label));
		
	}

	public void setModel(String model) {
		// TODO Auto-generated method stub
		getCar().setModel(new Model(model));
		
	}

	public void setColor(String color) {
		// TODO Auto-generated method stub
		getCar().setColor(color);
		
	}

	public void setPower(int power) {
		// TODO Auto-generated method stub
		getCar().setPower(power);
		
	}

}
