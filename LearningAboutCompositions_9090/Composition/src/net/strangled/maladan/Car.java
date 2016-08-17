package net.strangled.maladan;

public class Car extends Vehicle {
	private int doorNumber;
	private int engineCapacity;
	public Car(String name, int doorNumber, int engineCapacity) {
		super(name);
		this.doorNumber = doorNumber;
		this.engineCapacity = engineCapacity;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
}
