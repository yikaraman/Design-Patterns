package org.developer.patterns.chainofResponsibility;

public class Quarter extends Coin {
	
	public String toString() {
		return "25 Cent";
	}
	
	public Quarter(){
		setValue(25);
	}

}
