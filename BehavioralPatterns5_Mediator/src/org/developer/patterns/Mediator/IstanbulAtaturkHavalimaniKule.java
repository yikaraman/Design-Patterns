package org.developer.patterns.Mediator;

import java.util.ArrayList;

public class IstanbulAtaturkHavalimaniKule implements Kule
{

	private ArrayList<Sefer> seferList = new ArrayList<Sefer>();
	
	public ArrayList<Sefer> getSeferList() 
	{
		return seferList;
	}

	public void setSefer(ArrayList<Sefer> sefer) 
	{
		this.seferList = sefer;
	}

	public void seferEkle(Sefer sefer) 
	{
		if(!getSeferList().contains(sefer))
		{
			getSeferList().add(sefer);
			System.out.println("Kule: " + sefer.toString() + " " +
					"- sefer listesine eklendi");
		}
	}
	
	public void seferSil(Sefer sefer) 
	{
		if(getSeferList().contains(sefer))
		{
			getSeferList().remove(sefer);
			System.out.println("Kule: " + sefer.toString() + " " +
					"- sefer listesinen silindi");
		}
	}

	public void inisIzniVer(Sefer sefer) 
	{
		boolean inisYapiliyor = false;
		Sefer inisYapanSefer = null;
		
		if(getSeferList().contains(sefer))
		{

			for(int i=0; i < getSeferList().size(); i++)
			{
				Sefer tempSefer = getSeferList().get(i);

				if(tempSefer.isInisYapiyor())
				{
					inisYapiliyor = true;
					inisYapanSefer = tempSefer;
					break;
				}
			}
			
			if(!inisYapiliyor)
			{
				sefer.setInisYapiyor(true);
				System.out.println("Kule: " 
						+ sefer.toString() 
						+ "inis izni verildi.");
			}
			else
			{
				if(!sefer.equals(inisYapanSefer))
				{
					System.out.println("Kule: " 
						+ inisYapanSefer + " inis yapiyor. " +
						"Bu yuzden " + sefer +" seferine " +
						" inis izni verilemiyor!");
				}
			}
		}
		else
		{
			System.out.println(sefer.toString() 
					+ " sefer  listesinde yeralmiyor!");
		}		
				
	}

	public void kalkisIzniVer(Sefer sefer) 
	{
		boolean kalkisYapiliyor = false;
		Sefer kalkisYapanSefer = null;
		
		if(getSeferList().contains(sefer))
		{
			for(int i=0; i < getSeferList().size(); i++)
			{
				Sefer tempSefer = getSeferList().get(i);
				
				if(tempSefer.isKalkisYapiyor())
				{
					kalkisYapiliyor = true;
					kalkisYapanSefer = tempSefer;
					break;
				}
			}
			
			if(!kalkisYapiliyor)
			{
				sefer.setKalkisYapiyor(true);
				System.out.println("Kule: " + sefer.toString() 
						+ "kalkis izni verildi.");
			}
			else
			{
				if(!sefer.equals(kalkisYapanSefer))
				{
					System.out.println("Kule: " + 
					kalkisYapanSefer +" kalkis yapiyor. " +
					" Bu yuzden " + sefer + " " +
					"seferine kalkis izni verilemiyor!");
				}
			}
		}
		else
		{
			System.out.println(sefer.toString() 
			+ " sefer " +"listesinde yeralmiyor!");
		}	
	}
}
