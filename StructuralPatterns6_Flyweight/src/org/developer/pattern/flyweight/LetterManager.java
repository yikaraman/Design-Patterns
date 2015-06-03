package org.developer.pattern.flyweight;

import java.util.ArrayList;

public class LetterManager {

	private static final LetterManager mgr = new LetterManager();
	private ArrayList<Letter> letterList = new ArrayList<Letter>();
	private Letter[][] document = new Letter[50][50];
	private LetterManager() {

	}

	public static final LetterManager instance() {
		return mgr;
	}

	public static Letter getLetter(String letter) {

		Letter myletter = null;
		for (int i = 0; i < mgr.letterList.size(); i++) {

			Letter temp = mgr.letterList.get(i);

			if (temp.getLetter().equals(letter)) {
				myletter = temp;
				break;
			}
		}

		if (myletter == null) {
			myletter = new Letter(letter);
			mgr.letterList.add(myletter);
		}
		return myletter;
	}

	public void addLine(String line, int lineNumber) {

		for (int i = 0; i < line.length(); i++) {
			String letter = line.substring(i, i + 1);
			document[lineNumber][i] = getLetter(letter);
		}
	}

	public static void getDocument2() {

		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				if (mgr.document[i][j] != null) {
					System.out.print((mgr.document[i][j]).getLetter());
				} else
					break;
			}

			if (mgr.document[i][0] != null) {
				System.out.println("");
			}
		}
	}

	public ArrayList<Letter> getLetterList() {
		return letterList;
	}

	public void setLetterList(ArrayList<Letter> letterList) {
		this.letterList = letterList;
	}

	public Letter[][] getDocument() {
		return document;
	}

	public void setDocument(Letter[][] document) {
		this.document = document;
	}

}
