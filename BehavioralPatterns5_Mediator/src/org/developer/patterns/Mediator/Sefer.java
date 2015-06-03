package org.developer.patterns.Mediator;

public interface Sefer 
{
	
	void inisIzniAl();
	
	void kalkisIzniAl();
	
	boolean isKalkisYapiyor();

	boolean isInisYapiyor();

	void setInisYapiyor(boolean value);
	
	void setKalkisYapiyor(boolean value);
	
	void setKalkisTamamlandi(boolean value);
	
	void setInisTamamlandi(boolean value);
	
}
