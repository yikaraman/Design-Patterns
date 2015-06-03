package org.developer.pattern.bridge.produce;

import org.developer.pattern.bridge.Company.CompanyProducesThings2;
import org.developer.pattern.bridge.IF.IF_Produce;

public class ProduceImpl2 implements IF_Produce {

	
	private CompanyProducesThings2 companyProducesThings2 = new CompanyProducesThings2();
	@Override
	public void produceBook() {
		// TODO Auto-generated method stub
		companyProducesThings2.produceMusicBook();
		
	}

	@Override
	public void producePen() {
		// TODO Auto-generated method stub
		companyProducesThings2.producePencil();
		
	}
}
