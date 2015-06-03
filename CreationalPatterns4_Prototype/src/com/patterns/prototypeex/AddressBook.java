package com.patterns.prototypeex;

public class AddressBook {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Tavukcu Yolu Caddesi", "49", "Umraniye", "Istanbul");
		address.printAddress();
		Address newAddress = (Address) address.clone();
		newAddress.setDistrict("Bebek");
		newAddress.printAddress();
		
	}

}
