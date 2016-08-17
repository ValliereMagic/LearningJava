package net.strangled.maladan;

public class Floor {
	private String type;
	private int age;
	private String colour;
	private int waterResistance;
	private int filth;
	public Floor(String type, int age, String colour, int waterResistance) {
		super();
		this.type = type;
		this.age = age;
		this.colour = colour;
		this.waterResistance = waterResistance;
	}
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}
	public String getColour() {
		return colour;
	}
	public int getWaterResistance() {
		return waterResistance;
	}
	public int getFilth() {
		return filth;
	}
	public void droppedItemOnFloor() {
		System.out.println("An Item was dropped on the floor!");
		this.filth++;
	}
	public void removedItemFromFloor() {
		System.out.println("An item has been picked up off of the floor.");
		this.filth--;
	}

}
