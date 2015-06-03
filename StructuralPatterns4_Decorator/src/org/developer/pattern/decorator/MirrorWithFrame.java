package org.developer.pattern.decorator;

public class MirrorWithFrame extends MirrorDecorator {

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		getMirror().produce();
		addBorder();
	}

	private void addBorder() {
		// TODO Auto-generated method stub
		System.out.println("Border Added..");
	}
}
