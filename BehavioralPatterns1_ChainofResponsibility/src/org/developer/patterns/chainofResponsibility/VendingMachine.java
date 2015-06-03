package org.developer.patterns.chainofResponsibility;

public class VendingMachine {

	private static Coin chain = null;

	public static void main(String[] args) {

		chain = (new OneDollar()).setNext((new FiftyCent())
				.setNext((new Quarter()).setNext(new Cent())));

		addMoney(new Cent());
		addMoney(new FiftyCent());
		addMoney(new Cent());
		addMoney(new Quarter());
		addMoney(new Quarter());
		addMoney(new Cent());
		addMoney(new OneDollar());
		

	}

	private static void addMoney(Coin money) {
		// TODO Auto-generated method stub

		System.out.println("+++ -------------------- +++");
		System.out.println(money.toString() + "Atildi");
		chain.check(money);
		System.out.println("+++ -------------------- +++");

	}

}
