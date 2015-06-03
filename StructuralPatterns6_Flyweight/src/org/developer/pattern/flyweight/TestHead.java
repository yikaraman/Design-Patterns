package org.developer.pattern.flyweight;

public class TestHead {

	public static void main(String[] args) {
		String firstLine = "This is first line";
		String secondLine = "This is second line";

		LetterManager.instance().addLine(firstLine, 1);
		LetterManager.instance().addLine(secondLine, 2);

		LetterManager.getDocument2();

	}

}
