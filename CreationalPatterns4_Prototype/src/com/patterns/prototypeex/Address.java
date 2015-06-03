package com.patterns.prototypeex;

public class Address extends AddressPrototype {
	
	public Address (String street, String number, String district, String city){
		setStreet(street);
		setNo(number);
		setDistrict(district);
		setCity(city);
		
	}

}
