package org.developer.patterns.command;

public class TestHead {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		rc.pressTheButton(0);
		rc.pressTheButton(1);
	}
}
