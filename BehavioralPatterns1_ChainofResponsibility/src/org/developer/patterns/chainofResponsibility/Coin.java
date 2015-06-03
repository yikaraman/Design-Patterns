package org.developer.patterns.chainofResponsibility;

import java.util.ArrayList;

public class Coin {
	
	private ArrayList listOfCoin = new ArrayList<>();
	
	private int value;
	
	private Coin next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coin getNext() {
		return next;
	}

	public Coin setNext(Coin next) {
		this.next = next;
		return this;
	}

	public void check(Coin money){
		System.out.println("Next Object only : " + this + "can work..");
		
		if(money.getValue() != this.value){
			System.out.println( "DOes not have match-- next object delegation");
			
			if(getNext() != null){
				getNext().check(money);
			}else{
				System.out.println("End of chain: Coin: "+ money.toString() + "Not Appropriate..");
			}
		}else{
			listOfCoin.add(money);
			System.out.println("Accepted: "+ this.toString());
		}
	}
}
