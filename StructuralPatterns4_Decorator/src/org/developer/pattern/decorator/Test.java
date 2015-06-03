package org.developer.pattern.decorator;

public class Test {

	public static void main(String[] args) {
		HomeFurniture mirror = new MirrorWithFrame();
		mirror.produce();
	}
}
