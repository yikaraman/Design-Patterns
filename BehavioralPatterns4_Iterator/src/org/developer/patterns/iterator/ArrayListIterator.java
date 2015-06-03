package org.developer.patterns.iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

	private ArrayList<Player> team;

	private int pozition;

	public ArrayListIterator(ArrayList<Player> team) {
		// TODO Auto-generated constructor stub
		setTeam(team);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (pozition >= getTeam().size() || getTeam().get(pozition) == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Player player = getTeam().get(pozition);
		pozition++;
		return player;
	}

	public ArrayList<Player> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}

	public int getPozition() {
		return pozition;
	}

	public void setPozition(int pozition) {
		this.pozition = pozition;
	}

}
