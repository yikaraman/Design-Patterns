package org.developer.patterns.Mediator;

public class Atlas99 extends BaseSefer 
{
	
	public Atlas99(Kule kule)
	{
		setKule(kule);
		kule.seferEkle(this);
	}
	
	public String toString()
	{
		return "Atlas 99";
	}

	public void inisIzniAl() 
	{
		getKule().inisIzniVer(this);
		
	}

	public void kalkisIzniAl() 
	{
		getKule().kalkisIzniVer(this);	
	}
}
