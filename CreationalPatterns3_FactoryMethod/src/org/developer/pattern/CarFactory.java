package org.developer.pattern;

import java.util.ArrayList;

public abstract class CarFactory {

	// Abstract oldugu icin Bu sinifdan nesne turetilmez.
	// Araba uretim sureci Kontrol eder.

	public CarFactory() {
		this.createAuto();
	}

	public abstract void createAuto();

	private ArrayList<car> carList = new ArrayList<car>();

	public ArrayList<car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<car> carList) {
		this.carList = carList;
	}

}
