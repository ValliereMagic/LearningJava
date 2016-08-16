
public class SaturnIon extends Car{
	private String colour;
	private String accessories;
	private boolean airConditioning;
	private boolean heatedSeats;
	private boolean auxPort;
	SaturnIon(String colour, String accessories, boolean airConditioning, boolean heatedSeats, boolean auxPort) {
		super("2.2L Ecotec", 5, 193, "Standard", 4, 4, "Front: Disk, Rear: Drum", 70, 5);
		this.colour = colour;
		this.accessories = accessories;
		this.airConditioning = airConditioning;
		this.heatedSeats = heatedSeats;
		this.auxPort = auxPort;
	}
	public String getColour() {
		return this.colour;
	}
	public String getAccessories() {
		return this.accessories;
	}
	public boolean getAirConditioning() {
		return this.airConditioning;
	}
	public boolean getHeatedSeats() {
		return this.heatedSeats;
	}
	public boolean getAuxPort() {
		return this.auxPort;
	}
}
