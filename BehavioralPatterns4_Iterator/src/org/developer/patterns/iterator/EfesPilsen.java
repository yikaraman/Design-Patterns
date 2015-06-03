package org.developer.patterns.iterator;

import java.util.ArrayList;

public class EfesPilsen implements Team {
	
	private ArrayList<Player> team;
	
	public EfesPilsen(){
		
		team = new ArrayList<>();
		team.add(new Player("Drew", 4));
		team.add(new Player("Ender", 6));
		team.add(new Player("Cenk", 7));
		team.add(new Player("Kerem", 12));
		team.add(new Player("Loren", 17));
		team.add(new Player("ilker", 21));
	}

	public ArrayList<Player> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator(getTeam());
	}

}
