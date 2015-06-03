package org.developer.pattern.decorator;

public abstract class MirrorDecorator implements HomeFurniture {
	
	private HomeFurniture mirror = new Mirror();

	public HomeFurniture getMirror() {
		return mirror;
	}

	public void setMirror(HomeFurniture mirror) {
		this.mirror = mirror;
	}
}
