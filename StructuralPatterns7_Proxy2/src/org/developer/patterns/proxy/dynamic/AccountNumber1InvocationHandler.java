package org.developer.patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountNumber1InvocationHandler implements InvocationHandler {

	private BankAccount bankAccount;
	
	public AccountNumber1InvocationHandler(BankAccount bankAccount) {
		// TODO Auto-generated constructor stub
		setBankAccount(bankAccount);
		
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		
		try {
			if(method.getName().startsWith("invest")){
				return method.invoke(getBankAccount(), args);
			}else if(method.getName().startsWith("withdraw")){
				return method.invoke(getBankAccount(), args);
			}else if(method.getName().startsWith("get")){
				return method.invoke(getBankAccount(), args);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
