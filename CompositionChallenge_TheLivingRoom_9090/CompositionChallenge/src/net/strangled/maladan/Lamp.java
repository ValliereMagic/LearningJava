package net.strangled.maladan;

public class Lamp {
	private int wattage;
	private int numberOfBulbs;
	private String colour;
	private boolean power;
	public Lamp(int wattage, int numberOfBulbs, String colour) {
		super();
		this.wattage = wattage;
		this.numberOfBulbs = numberOfBulbs;
		this.colour = colour;
	}
	public int brightness;
	public int getWattage() {
		return wattage;
	}
	public int getNumberOfBulbs() {
		return numberOfBulbs;
	}
	public String getColour() {
		return colour;
	}
	public int getBrightness() {
		return brightness;
	}
	public boolean getPowerState() {
		return power;
	}
	public void lampTurnedOn() {
		System.out.println("Lamp was turned on");
		this.power = true;
	}
	public void lampTurnedOff() {
		System.out.println("Lamp was turned off.");
		this.power = false;
	}
}
