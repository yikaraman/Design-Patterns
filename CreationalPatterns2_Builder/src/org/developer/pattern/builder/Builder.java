package org.developer.pattern.builder;

public abstract class Builder {
	
	private Car car = null;
	
	public Builder(){
		
	}
	
	//Singleton 
	public Car getCar(){
		if(car == null)
			car = new Car();
		return car;
	}
	
	public abstract void setLabel(String label);
	public abstract void setModel(String model);
	public abstract void setColor(String color);
	public abstract void setPower(int power);

}
