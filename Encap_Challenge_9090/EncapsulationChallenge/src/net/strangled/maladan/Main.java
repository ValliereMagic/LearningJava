package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		Printer lexmark = new Printer(100, false);
		lexmark.printPage(25);
		lexmark.printPage(75);
		System.out.println(lexmark.getTonerLevel());
		lexmark.replaceTonerCartridge();
		System.out.println(lexmark.getTonerLevel());
		lexmark.printPage(25);
		System.out.println(lexmark.getPrintCounter());

	}

}
