package org.developer.pattern.composite;

import java.util.ArrayList;

public class Computer implements Part {

	private ArrayList<Part> partOfList = new ArrayList<Part>();

	public void addParts(Part part) {
		getPartOfList().add(part);
	}

	public void removeParts(Part part) {
		if (getPartOfList().contains(part))
			getPartOfList().remove(part);
	}

	public ArrayList<Part> getPartOfList() {
		return partOfList;
	}

	public void setPartOfList(ArrayList<Part> partOfList) {
		this.partOfList = partOfList;
	}

	public Part getPartFromList(int index) throws Exception {
		Part part = null;
		try {
			part = getPartOfList().get(index);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception(index + " part does not found.");
		}
		return part;
	}

	@Override
	public int howMuchDoesitCost() {
		// TODO Auto-generated method stub
		int price = 0;

		for (int i = 0; i < getPartOfList().size(); i++) {
			price += getPartOfList().get(i).howMuchDoesitCost();
		}
		return price;
	}
}
