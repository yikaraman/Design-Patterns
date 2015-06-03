package org.developer.patterns.proxy.dynamic;

import java.lang.reflect.Proxy;

public class TestMain {

	public static void main(String[] args) throws Exception {
		TestMain test = new TestMain();
		test.start();
	}

	public void start() throws Exception {
		// TODO Auto-generated method stub
		
		try {
			
			BankAccount ba = new BankAccountImpl("ilker", "Karamanli", 1000);
			
			BankAccount myAccount = getmyAccountProxy(ba);
			myAccount.invest(2000);
			myAccount.withdraw(100);
			
			System.out.println("Balance: " + myAccount.getBalance());
			
			BankAccount anotherAccount = getAnotherAccountProxy(ba);
			anotherAccount.invest(500);
			anotherAccount.withdraw(200);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected BankAccount getmyAccountProxy(BankAccount ba) {
		// TODO Auto-generated method stub
		return (BankAccount) Proxy.newProxyInstance(ba.getClass().getClassLoader(), ba.getClass().getInterfaces(), new AccountNumber1InvocationHandler(ba));
	}
	
	protected BankAccount getAnotherAccountProxy(BankAccount ba) {
		// TODO Auto-generated method stub
		return (BankAccount) Proxy.newProxyInstance(ba.getClass().getClassLoader(), ba.getClass().getInterfaces(), new AccountNumber2InvocationHandler(ba));
	}
}
