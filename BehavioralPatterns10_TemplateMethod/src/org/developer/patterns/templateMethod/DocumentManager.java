package org.developer.patterns.templateMethod;

public abstract class DocumentManager 
{

	public final Document getDocument(String name)
	{
		Document dokument = openDocument(name);
		checkDocument(dokument);		
		return dokument;
	}
	
	public abstract void checkDocument(Document document);
	
	public abstract Document openDocument(String s);
}
