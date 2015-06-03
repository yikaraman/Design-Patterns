package org.developer.patterns.memento;

public class Memento {

	private Object[] elements;
	
	public Memento(Object[] elem) {
		// TODO Auto-generated constructor stub
		this.setElements(elem);
	}

	public Object[] getElements() {
		// TODO Auto-generated method stub
		return elements;
	}

	public void setElements(Object[] elements) {
		this.elements = elements;
	}

}

