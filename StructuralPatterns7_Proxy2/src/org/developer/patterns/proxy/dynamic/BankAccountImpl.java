package org.developer.patterns.proxy.dynamic;

public class BankAccountImpl implements BankAccount {

	private String name;
	private String lastname;
	private int balance = 0;
	private boolean cancelled = false;

	public BankAccountImpl(String name, String lastname, int amount) {
		// TODO Auto-generated constructor stub
		setName(name);
		setLastname(lastname);
		setBalance(amount);
	}

	public BankAccountImpl() {
		// TODO Auto-generated constructor stub
	}

	public int withdraw(int amount) throws Exception {
		// TODO Auto-generated method stub
		if (getBalance() - amount > 0)
			setBalance(getBalance() - amount);
		else
			throw new Exception("There is no enough Money");
		return amount;
	}

	public void invest(int amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amount);

	}

	public boolean cancel() {
		// TODO Auto-generated method stub
		setCancelled(true);
		return isCancelled();
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	public String getLastame() {
		// TODO Auto-generated method stub
		return lastname;
	}

	public void setLastname(String lastname) {
		// TODO Auto-generated method stub
		this.lastname = lastname;

	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void setBalance(int balance) {
		// TODO Auto-generated method stub
		this.balance = balance;

	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	

}
