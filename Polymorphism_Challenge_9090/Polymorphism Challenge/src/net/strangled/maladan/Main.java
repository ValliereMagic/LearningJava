package net.strangled.maladan;

class Car {
	private int cylinders;
	private String name;
	private boolean engine;
	private int wheels;
	private boolean engineRunning;
	private int speed;
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
		this.engineRunning = false;
		this.speed = 0;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getCylinders() {
		return cylinders;
	}
	public String getName() {
		return name;
	}
	public boolean isEngineRunning() {
		return engineRunning;
	}
	public void startEngine() {
		this.engineRunning = true;
		System.out.println("Car is running.");
	}
	public void accelerate(int speed) {
		this.speed += speed;
		System.out.println("Car is now going: " + this.speed + " Kilometeres per hour.");
	}
	public void decelerate(int speed) {
		this.speed -= speed;
		System.out.println("Car is now going: " + this.speed + " Kilometeres per hour.");
	}
	public void stop() {
		this.speed = 0;
		System.out.println("The car has stopped.");
	}
}
class Ferrari_enzo extends Car {
	public Ferrari_enzo() {
		super(12, "Ferrari Enzo");
	}
	@Override
	public void startEngine() {
		System.out.println("That may wake up the neighbors, but oh well.");
		super.startEngine();
	}
}
class Ferrari_458_italia extends Car{
	public Ferrari_458_italia() {
		super(8, "Ferrari 458 Italia");
	}
	@Override
	public void startEngine() {
		System.out.println("Have fun!");
		super.startEngine();
	}
}
class Lamborghini_Aventador extends Car {
	public Lamborghini_Aventador() {
		super(12, "Lamborghini Aventador");
	}
	@Override
	public void startEngine() {
		System.out.println("People will be watching that car...");
		super.startEngine();
	}
}
class Trailertrash extends Car {
	public Trailertrash() {
		super(4, "Crap");
	}
}

public class Main {
	public static void main(String[] args) {
	for(int i = 1; i <= 5; i++) {	
		System.out.println("_________________________");
		startCars(chooseCar());
		System.out.println("_________________________");
	}
	}
	public static Car chooseCar() {
		int randomNumber = (int) (Math.random()*4) + 1;
		if(randomNumber == 1) {
			System.out.println("Number was 1");
			return new Ferrari_enzo();
		} else if (randomNumber == 2) {
			System.out.println("Number was 2");
			return new Ferrari_458_italia();
		} else if (randomNumber == 3) {
			System.out.println("Number was 3");
			return new Lamborghini_Aventador();
		} else if (randomNumber == 4) {
			System.out.println("Number was 4");
			return new Trailertrash(); 
		} else {
			return null;
		}
	}
	public static void startCars(Car car) {
		car.startEngine();
	}
}
