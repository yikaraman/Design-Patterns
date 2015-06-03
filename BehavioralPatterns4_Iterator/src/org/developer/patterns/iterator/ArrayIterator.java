package org.developer.patterns.iterator;

public class ArrayIterator implements Iterator {

	private Player[] team;
	private int pozition;

	public ArrayIterator(Player[] team) {
		// TODO Auto-generated constructor stub
		setTeam(team);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (pozition >= getTeam().length || getTeam()[pozition] == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Player player = getTeam()[pozition];
		pozition++;
		return player;
	}

	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
		this.team = team;
	}

	public int getPozition() {
		return pozition;
	}

	public void setPozition(int pozition) {
		this.pozition = pozition;
	}

}
