package org.developer.pattern.bridge.product;

import org.developer.pattern.bridge.IF.IF_Produce;
import org.developer.pattern.bridge.produce.Storage;

public class Pencil extends Storage {

	public Pencil(IF_Produce produce) {
		super(produce);
		// TODO Auto-generated constructor stub
	}
	
	public void produce(){
		producePencil();
	}

	private void producePencil() {
		// TODO Auto-generated method stub
		getProduce().producePen();	
	}
}
