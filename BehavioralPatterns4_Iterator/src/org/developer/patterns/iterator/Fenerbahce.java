package org.developer.patterns.iterator;

public class Fenerbahce implements Team {
	
	private Player[] team = new Player[5];
	
	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
		this.team = team;
	}

	public Fenerbahce() {
		// TODO Auto-generated constructor stub
		
		team[0] = new Player("Onur" , 4);
		team[1] = new Player("Mehmet" , 6);
		team[2] = new Player("Zafer" , 9);
		team[3] = new Player("Metin" , 12);
		team[4] = new Player("Ali" , 13);
		
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new ArrayIterator(getTeam());
	}
	
	

}
