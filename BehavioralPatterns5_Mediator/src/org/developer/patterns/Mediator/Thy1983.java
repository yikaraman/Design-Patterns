package org.developer.patterns.Mediator;


public class Thy1983 extends BaseSefer
{

	public Thy1983(Kule kule)
	{
		setKule(kule);
		kule.seferEkle(this);
	}
	
	public String toString()
	{
		return "Thy 1983";
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
