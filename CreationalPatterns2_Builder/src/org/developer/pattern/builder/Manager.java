package org.developer.pattern.builder;

public class Manager {
	
	private Builder builder;
 	 
	/**
	 * @param label 
	 * @param model 
	 * @param color
	 * @param power 
	 * @return 
	 */
	
	public Car createOrder(String label, String model, String color, int power) 
	{
		if(label.equals("Audi"))
		{
			builder = new Audi();
		}
		else if(label.equals("Ford"))
		{
			System.out.println("Nothing");
		}
		
		this.builder.setLabel(label);
		this.builder.setModel(model);
		this.builder.setColor(color);
		this.builder.setPower(power);
		return this.builder.getCar();
	}
	


	public void printOrder() {
		System.out.println("Marka: " + this.builder.getCar().getLabel());
		System.out.println("Model: " + this.builder.getCar().getModel());
		System.out.println("Color: " + this.builder.getCar().getColor());
		System.out.println("Power: " + this.builder.getCar().getPower());
	}

}
