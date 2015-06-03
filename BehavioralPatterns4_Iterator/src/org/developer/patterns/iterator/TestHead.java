package org.developer.patterns.iterator;

public class TestHead {
	
	public static void main(String[] args) {
		
		
		EfesPilsen efesPilsen = new EfesPilsen();
		Iterator it = efesPilsen.getIterator();
		
		while (it.hasNext()) {
			Player player = (Player) it.next();
			System.out.println(player.getName());
		}
		
//		for (int i = 0; i < efesPilsen.getTeam().size(); i++) {
//			System.out.println(efesPilsen.getTeam().get(i).getName());
//		}
		
		
		Fenerbahce fb = new Fenerbahce();
		it = fb.getIterator();
		
		while (it.hasNext()) {
			Player player = (Player) it.next();
			System.out.println(player.getName());
		}
		
//		
//		for (int i = 0; i < fb.getTeam().length; i++) {
//			System.out.println(fb.getTeam()[i].getName());
//		}

	}

}
