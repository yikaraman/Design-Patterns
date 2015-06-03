package org.developer.patterns.command;

public class ShutdownTVCommand implements Command{
	
	private TV tv = null;

	public ShutdownTVCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.tv.shutdown();

	}

}
