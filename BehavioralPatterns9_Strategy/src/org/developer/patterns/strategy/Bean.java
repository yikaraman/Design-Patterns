package org.developer.patterns.strategy;

import java.io.Serializable;

public class Bean implements Serializable
{

   private static final long serialVersionUID = -7587903521667052525L;
   
   private int counter;
	private String name;
	
	public int getCounter() 
	{
		return counter;
	}
	public void setCounter(int counter) 
	{
		this.counter = counter;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
}
