package org.developer.patterns.Mediator;

public class Test 
{
	public static void main(String[] args) 
	{
		Kule kule = new IstanbulAtaturkHavalimaniKule();
		Sefer thy1983 = new Thy1983(kule);
		Sefer atlas99 = new Atlas99(kule);
		
		thy1983.inisIzniAl();		
		atlas99.inisIzniAl();
		thy1983.setInisTamamlandi(true);
		atlas99.inisIzniAl();
		thy1983.inisIzniAl();
		atlas99.setInisTamamlandi(true);
		
		atlas99.kalkisIzniAl();
		thy1983.kalkisIzniAl();
		thy1983.kalkisIzniAl();
		atlas99.setKalkisTamamlandi(true);
		thy1983.kalkisIzniAl();
	}
}
