package com.patterns.prototypeex;

public class CompanyAddress extends AddressPrototype {

	private String companyName;

	public CompanyAddress(String companyName, String street, String number,
			String district, String city) {
		// TODO Auto-generated constructor stub
		setCompanyName(companyName);
		setStreet(street);
		setNo(number);
		setDistrict(district);
		setCity(city);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
