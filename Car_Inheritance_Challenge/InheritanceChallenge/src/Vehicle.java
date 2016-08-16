
public class Vehicle {
	private String engine;
	private int passengerCapacity;
	private int topSpeed;
	private String medium;
	private String transmission;
	
	
	public Vehicle(String engine, int passengerCapacity, int topSpeed, String medium, String transmission) {
		this.engine = engine;
		this.passengerCapacity = passengerCapacity;
		this.topSpeed = topSpeed;
		this.medium = medium;
		this.transmission = transmission;
	}
	public String getEngine() {
		return this.engine;
	}
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	public int topSpeed() {
		return this.topSpeed;
	}
	public String getMedium() {
		return this.medium;
	}
	public String getTransmission() {
		return this.transmission;
	}
}
