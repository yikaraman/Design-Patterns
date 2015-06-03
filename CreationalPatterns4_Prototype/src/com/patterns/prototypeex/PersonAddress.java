package com.patterns.prototypeex;

public class PersonAddress extends AddressPrototype{
	
	private String name;
	private String lastname;
	
	public PersonAddress(String name, String lastname, String street, String number, String district, String city) {
		// TODO Auto-generated constructor stub
		setName(name);
		setLastname(lastname);
		setStreet(street);
		setNo(number);
		setDistrict(district);
		setCity(city);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
