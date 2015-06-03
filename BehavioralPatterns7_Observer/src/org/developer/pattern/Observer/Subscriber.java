package org.developer.pattern.Observer;

public interface Subscriber {

	void update();
	void cancelSubs();
	void becomeAMember(Newspaper news);
	
}
