package org.developer.pattern.bridge.produce;

import org.developer.pattern.bridge.IF.IF_Produce;

public abstract class Storage {
	
	private IF_Produce produce;
	
	public abstract void produce();
	
	public Storage(IF_Produce produce) {
		// TODO Auto-generated constructor stub
		setProduce(produce);
		
	}

	public IF_Produce getProduce() {
		return produce;
	}

	public void setProduce(IF_Produce produce) {
		this.produce = produce;
	}
}
