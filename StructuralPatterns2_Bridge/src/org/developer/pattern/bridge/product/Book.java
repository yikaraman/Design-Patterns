package org.developer.pattern.bridge.product;

import org.developer.pattern.bridge.IF.IF_Produce;
import org.developer.pattern.bridge.produce.Storage;

public class Book  extends Storage {

	public Book(IF_Produce produce) {
		super(produce);
		// TODO Auto-generated constructor stub
	}
	
	public void produce(){
		produceBook();
		
	}

	private void produceBook() {
		// TODO Auto-generated method stub
		getProduce().produceBook();
	}
}
