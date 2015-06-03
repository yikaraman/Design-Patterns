package org.developer.patterns.memento;

public class TestHead {
	
	public static void main(String[] args) {
		
		Document document = new Document();
		
		document.addLine(0, "--------------------------");
		document.addLine(1, "+                        +");
		document.addLine(2, "+          ILKER         +");
		document.addLine(3, "+                        +");
		document.addLine(4, "--------------------------");
		
		Memento memento = document.createMemento();
		
		
		System.out.println("Initiative document..");
		System.out.println(document.toString());
		
		document.removeLine(1);
		document.addLine(1, "+         HEY HEY         +");
		
		System.out.println("Updated document..");
		System.out.println(document.toString());
		
		document.setMemento(memento);
		
		System.out.println("Final document..");
		System.out.println(document.toString());
		
		
		
	}
	
	

}
