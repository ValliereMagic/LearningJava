package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("A31 Chaser", "Thermaltake", "240", dimensions);
		Monitor theMonitor = new Monitor("27inch Beast", "benQ", 27, new Resolution(1920,1080));
		Motherboard theMotherboard = new Motherboard("P8H61-M PRO", "Asus", 2, 3, "v2.44");
		PC thePc = new PC(theCase, theMonitor, theMotherboard);
		thePc.powerUp();
		thePc.getMotherboardManufacturer();

	}

}
