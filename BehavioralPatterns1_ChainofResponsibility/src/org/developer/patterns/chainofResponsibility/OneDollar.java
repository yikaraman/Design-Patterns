package org.developer.patterns.chainofResponsibility;

public class OneDollar extends Coin{
	
	public String toString() {
		return "1 Dollar";
	}
	
	public OneDollar(){
		setValue(100);
	}

}
