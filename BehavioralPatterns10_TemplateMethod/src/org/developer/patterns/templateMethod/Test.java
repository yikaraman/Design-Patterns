package org.developer.patterns.templateMethod;

public abstract class Test 
{
	public static void main(String[] args) 
	{
		DocumentManager manager = new DocumentManagerImpl();
		@SuppressWarnings("unused")
      Document document = manager.getDocument("test_dok");
	}
}
