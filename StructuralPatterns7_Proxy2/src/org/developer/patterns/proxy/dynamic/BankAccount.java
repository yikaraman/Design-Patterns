package org.developer.patterns.proxy.dynamic;

public interface BankAccount {
	
	public int withdraw(int amount) throws Exception;
	public void invest(int amount);
	public String getName();
	public void setName(String name);
	public String getLastame();
	public void setLastname(String lastname);
	public int getBalance();
	public void setBalance(int balance);
	public boolean cancel();
	

}
