package org.developer.patterns.command;

public class RemoteControl {

	public Command[] button = new Command[2];

	public RemoteControl() {
		TV tv = new TV();
		button[0] = new OpenTVCommaned(tv);
		button[1] = new ShutdownTVCommand(tv);

	}

	public void pressTheButton(int i) {
		if (i > button.length || i < 0) {
			throw new RuntimeException("Invalid button");

		}
		button[i].execute();
	}

}
