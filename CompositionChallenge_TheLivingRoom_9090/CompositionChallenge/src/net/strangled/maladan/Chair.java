package net.strangled.maladan;

public class Chair {
	private String colour;
	private String fabric;
	private int cleanliness;
	public Chair(String colour, String fabric, int cleanliness) {
		super();
		this.colour = colour;
		this.fabric = fabric;
		this.cleanliness = cleanliness;
	}
	public String getColour() {
		return colour;
	}
	public String getFabric() {
		return fabric;
	}
	public int getCleanliness() {
		return cleanliness;
	}
	public void couchFilthIncrease(int filth) {
		System.out.println("Chair has increased in filth by: " + filth);
		this.cleanliness -= filth;
	}
	public void couchFilthDecrease(int clean) {
		System.out.println("Chair has been cleaned, increasing the cleanliness by: " + clean);
		this.cleanliness += clean;
	}
}
