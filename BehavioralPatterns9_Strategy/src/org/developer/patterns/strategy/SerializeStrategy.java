package org.developer.patterns.strategy;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeStrategy implements Strategy
{
	
	public void save(Bean bean) 
	{
		try 
		{
			ObjectOutput out = new ObjectOutputStream(
					new FileOutputStream("/Users/yikaraman/Desktop/bean.ser"));
			out.writeObject(bean);
			out.close();
		} 
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
}
