package net.strangled.maladan;

public class Printer {
	private int tonerLevel;
	private int printCounter;
	private boolean isDuplex;
	public Printer(int tonerLevel, boolean isDuplex) {
		super();
		if(tonerLevel <= 100 && tonerLevel >= 0) {
			this.tonerLevel = tonerLevel;
		}
		this.isDuplex = isDuplex;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getPrintCounter() {
		return printCounter;
	}
	public boolean isDuplex() {
		return isDuplex;
	}
	public void printPage(int pages) {
		if(pages < 100 && pages <= this.tonerLevel) {
			boolean finished = false;
			int counter = 0;
			while (finished == false) {
				this.tonerLevel --;
				this.printCounter ++;
				counter++;
				
				if(counter == pages) {
					finished = true;
					System.out.println(counter + " pages have been printed.");
				}
			}
		} else {
			System.out.println("You can print a maximum of: 100 pages on one toner cartridge");
		}
	}
	public void replaceTonerCartridge() {
		System.out.println("Toner cartridge has been replaced.");
		this.tonerLevel = 100;
	}
}
