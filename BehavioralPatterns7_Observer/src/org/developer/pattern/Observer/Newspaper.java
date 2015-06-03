package org.developer.pattern.Observer;

public interface Newspaper {
	
	void addSubscriber(Subscriber subscriber);
	void removeSubscriber(Subscriber subscriber);
	void sendNewspaper();

}
