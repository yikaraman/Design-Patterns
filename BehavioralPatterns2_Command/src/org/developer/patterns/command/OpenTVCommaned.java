package org.developer.patterns.command;

public class OpenTVCommaned implements Command {

	private TV tv = null;

	public OpenTVCommaned(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.tv.open();

	}

}
