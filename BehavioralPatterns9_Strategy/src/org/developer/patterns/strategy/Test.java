package org.developer.patterns.strategy;

public class Test 
{
	public static void main(String[] args)
	{
		Bean bean = new Bean();
		bean.setCounter(10);
		bean.setName("name");
		FileManager.instance().saveBean(bean);
	}
}
