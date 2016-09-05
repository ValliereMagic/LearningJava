package net.strangled.maladan;
import java.util.Scanner;
public class Main {
	public static BankOfBlarg bank = new BankOfBlarg();
	public static Scanner input = new Scanner(System.in);
	public static boolean running = true;
	public static void main(String[] args) {
		Header_Instructions.programHeader();
		Header_Instructions.programInstructions();
		while(running) {
			System.out.println("Enter your choice Operation: ");
			int choice = input.nextInt();
			Choice.choice(choice);
		}
	}
}