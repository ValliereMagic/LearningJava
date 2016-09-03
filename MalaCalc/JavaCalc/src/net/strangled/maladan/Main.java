package net.strangled.maladan;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	public static Instructions instructions = new Instructions();
	public static void main(String[] args) {
		boolean running = true;
		int selection;
		instructions.getProgramHeader();
		instructions.getInstructions();
		while(running) {
			Choice choice = new Choice();
			running = choice.isRunning();
			selection = choice.getChoice();
			choice.calculate(selection);
		}
	}
}