package org.developer.pattern.facade;

public class FacadeImpl implements ComponentFacade {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		new one_class().doSomething();

	}

}
