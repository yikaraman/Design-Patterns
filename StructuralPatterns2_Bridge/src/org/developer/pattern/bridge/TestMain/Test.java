package org.developer.pattern.bridge.TestMain;

import java.awt.print.Book;

import org.developer.pattern.bridge.produce.ProduceImpl;
import org.developer.pattern.bridge.produce.ProduceImpl2;
import org.developer.pattern.bridge.produce.Storage;
import org.developer.pattern.bridge.product.Pencil;

public class Test {
	
	public static void main(String[] args) {
		
		Storage book = new org.developer.pattern.bridge.product.Book(new ProduceImpl());
		book.produce();
		
		book = new org.developer.pattern.bridge.product.Book(new ProduceImpl2());
		book.produce();
		
		
		Storage pencil = new Pencil(new ProduceImpl());
		pencil.produce();
		
		pencil = new Pencil(new ProduceImpl2());
		pencil.produce();
		
	}

}
