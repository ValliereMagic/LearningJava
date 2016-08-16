
public class Car extends Vehicle {
	private int wheelCount;
	private int cylinderCount;
	private String brakeType;
	private int maxTurningAngle;
	private int gearNumber;
	
	
	public Car(String engine, int passengerCapacity, int topSpeed, String transmission, int wheelCount, int cylinderCount, String brakeType, int maxTurningAngle, int gearNumber) {
		super(engine, passengerCapacity, topSpeed, "Road", transmission);
		this.wheelCount = wheelCount;
		this.cylinderCount = cylinderCount;
		this.brakeType = brakeType;
		this.maxTurningAngle = maxTurningAngle;
		this.gearNumber = gearNumber;
	}
	public int getWheelCount() {
		return this.wheelCount;
	}
	public int getcylenderCount() {
		return this.cylinderCount;
	}
	public String getBrakeType() {
		return this.brakeType;
	}
	public int getMaxTurningAngle() {
		return this.maxTurningAngle;
	}
	public int getGearNumber() {
		return gearNumber;
	}
	public void move(int distance, int speed) {
		if (speed > this.topSpeed()) {
			System.out.println("In your dreams.");
		} else {
			System.out.println("Car has moved " + distance + " Kilometeres" + " at " + speed + " kilometeres per hour.");
		}
	
	}
	public void turn(int turnAngle) {
		if (turnAngle > this.maxTurningAngle || turnAngle <= 0) {
			System.out.println("That angle is above the car's maximum turning angle.");
		} else {
			System.out.println("Car has turned " + turnAngle + " degrees.");
		}
	}
	public void changeGear(int gearNumber) {
		if (gearNumber > this.gearNumber || gearNumber <= 0) {
			System.out.println("this car doesn't have that many gears.");
		} else {
			System.out.println("Car has shifted into: " + gearNumber);
		}
	}
	
}
