package org.developer.patterns.chainofResponsibility;

public class Cent extends Coin{
	
	public String toString() {
		return "1 Cent";
	}
	
	public Cent(){
		setValue(1);
	}

}
