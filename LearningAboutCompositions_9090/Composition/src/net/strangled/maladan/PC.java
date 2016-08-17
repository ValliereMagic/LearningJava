package net.strangled.maladan;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	private void drawLogo() {
		//Fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	public void getMotherboardManufacturer() {
		getMotherboard();
	}
	private void getMotherboard() {
	   System.out.println(motherboard.getManufacturer());
	}

}
