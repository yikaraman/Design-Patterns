package com.patterns.prototypeex;

public class AddressPrototype implements Cloneable {

	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	private String street;
	private String no;
	private String district;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public void printAddress(){
		
		System.out.println("Street: " + getStreet());
		System.out.println("No: " + getNo());
		System.out.println("District: " + getDistrict());
		System.out.println("City: " + getCity());
		System.out.println("HashCode: " + hashCode());
	}

}
