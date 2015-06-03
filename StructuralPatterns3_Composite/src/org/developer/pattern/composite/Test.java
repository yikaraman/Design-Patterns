package org.developer.pattern.composite;

public class Test {

	public static void main(String[] args) {

		Computer computer = new Computer();

		Part keyboard = new Keyboard();
		Part monitor = new Monitor();
		Part ram1 = (Part) new RandomAccessMemory256MB();
		Part ram2 = (Part) new RandomAccessMemory256MB();
		Part ram3 = (Part) new RandomAccessMemory256MB();
		Part ram4 = (Part) new RandomAccessMemory256MB();

		computer.addParts(monitor);
		computer.addParts(keyboard);
		computer.addParts(ram1);
		computer.addParts(ram2);
		computer.addParts(ram3);
		computer.addParts(ram4);

		System.out.println("Total Price: " + computer.howMuchDoesitCost());
	}
}
