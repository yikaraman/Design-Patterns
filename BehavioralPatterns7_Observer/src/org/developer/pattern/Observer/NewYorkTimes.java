package org.developer.pattern.Observer;

import java.util.ArrayList;

public class NewYorkTimes implements Newspaper {

	private ArrayList<Subscriber> aboneler = new ArrayList<Subscriber>();

	public void aboneEkle(Subscriber abone) {
		getAboneler().add(abone);
	}

	public void aboneSil(Subscriber abone) {
		getAboneler().remove(abone);
	}

	public void gazeteGonder() {
		for (int i = 0; i < getAboneler().size(); i++) {
			getAboneler().get(i).update();
		}
	}

	public ArrayList<Subscriber> getAboneler() {
		return aboneler;
	}

	public void setAboneler(ArrayList<Subscriber> aboneler) {
		this.aboneler = aboneler;
	}

	@Override
	public void addSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendNewspaper() {
		// TODO Auto-generated method stub
		
	}

}
