package org.developer.pattern.Factory;

public class Test {
	
	public static void main(String[] args) {
		Document doc = DocumentFactory.createDocument("PDF");
		System.out.println(doc.getDocumentType());
		
		Document doc2 = DocumentFactory.createDocument("WORD");
		System.out.println(doc2.getDocumentType());
		
		Document doc3 = DocumentFactory.createDocument("ddfdfs");
		System.out.println(doc3.getDocumentType());
		
	}
}
