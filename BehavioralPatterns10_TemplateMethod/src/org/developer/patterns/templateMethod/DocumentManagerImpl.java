package org.developer.patterns.templateMethod;

public class DocumentManagerImpl extends DocumentManager
{

	@Override
	public void checkDocument(Document dokument) 
	{
		System.out.println("Document checked...");
		
	}

	@Override
	public Document openDocument(String s) 
	{
		System.out.println("Document " + s + " opened.");
		return new Pdf();
	}
}
