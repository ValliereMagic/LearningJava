package net.strangled.maladan;

public class Couch {
	private String fabric;
	private String colour;
	private CouchSize size;
	private int occupants;
	public Couch(String fabric, String colour, CouchSize size, int occupants) {
		super();
		this.fabric = fabric;
		this.colour = colour;
		this.size = size;
		this.occupants = occupants;
	}
	public String getFabric() {
		return fabric;
	}
	public String getColour() {
		return colour;
	}
	public CouchSize getSize() {
		return size;
	}
	public int getOccupants() {
		return occupants;
	}
	public void addOccupants(int occupant) {
		System.out.println(occupant + " occupants have been added to the couch.");
		this.occupants += occupant;
	}
	public void removeOccupants(int occupant) {
		System.out.println(occupant + " occupants have been removed from the couch.");
	}
}
