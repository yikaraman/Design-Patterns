package org.developer.pattern.bridge.produce;

import org.developer.pattern.bridge.Company.CompanyProducesThings1;
import org.developer.pattern.bridge.IF.IF_Produce;

public class ProduceImpl implements IF_Produce {

	
	private CompanyProducesThings1 companyProducesThings1 = new CompanyProducesThings1();
	@Override
	public void produceBook() {
		// TODO Auto-generated method stub
		companyProducesThings1.produceBlokedBook();
		
	}

	@Override
	public void producePen() {
		// TODO Auto-generated method stub
		companyProducesThings1.producePen();
		
	}

}
