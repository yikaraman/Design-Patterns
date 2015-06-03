package org.developer.patterns.memento;

import java.util.ArrayList;
import java.util.Iterator;

public class Document {

	private ArrayList<String> lines = new ArrayList<String>();

	public void addLine(int index, String line) {
		getLines().add(index, line);
	}

	public void removeLine(int index) {
		getLines().remove(index);

	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

	public Memento createMemento() {
		return new Memento(getLines().toArray());
	}

	public void setMemento(Memento memento) {
		getLines().clear();
		Object[] tmpLines = memento.getElements();

		for (int i = 0; i < tmpLines.length; i++) {
			String line = (String) tmpLines[i];
			getLines().add(line);
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < getLines().size(); i++) {
			sb.append(getLines().get(i)).append("\n");
		}
		return sb.toString();
	}

}
