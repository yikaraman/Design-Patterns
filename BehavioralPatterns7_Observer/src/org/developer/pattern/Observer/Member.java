package org.developer.pattern.Observer;

public class Member implements Subscriber
{
	private Newspaper newspaper;
	
	public Newspaper getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(Newspaper newspaper) {
		this.newspaper = newspaper;
	}

	private String name;
	private String lastname;
	
	
	public Member(String name, String lastname)
	{
		setName(name);
		setLastname(lastname);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " " + getLastname() + " " + "gazeteyi aldi");
		
	}
	@Override
	public void cancelSubs() {
		// TODO Auto-generated method stub
		getNewspaper().removeSubscriber(this);
		System.out.println(getName() + " " + getLastname() + " " + "aboneligini sonlandirdi");
	}

	@Override
	public void becomeAMember(Newspaper news) {
		// TODO Auto-generated method stub
		setNewspaper(news);
		newspaper.addSubscriber(this);
		
		System.out.println(getName() + " " + getLastname() + " " + "abone oldu");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


}
