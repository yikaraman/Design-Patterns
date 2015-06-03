package org.developer.pattern;

public abstract class car {

	private String Label = null;
	private String Model = null;
	private int Power = 0;

	public car(String label, String model, int power) {
		setLabel(label);
		setModel(model);
		setPower(power);
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

}
