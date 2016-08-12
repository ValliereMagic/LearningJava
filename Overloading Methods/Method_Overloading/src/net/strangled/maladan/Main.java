package net.strangled.maladan;
import java.util.Scanner;
public class Main {
	public static Scanner input;
	public static void main(String[] args) {
	boolean running = true;
	while (running) {
		input = new Scanner(System.in);
		System.out.println("Enter a value for feet.");
		double feet = input.nextDouble();
		System.out.println("Enter a Value for Inches.");
		double inches = input.nextDouble();
			if(feet >= 1 && inches >= 1) {
				calcFeetAndInches(feet, inches);
			} else if (feet == 0 && inches >= 1){
				calcFeetAndInches(inches);
			} else if (inches == 0 && feet >= 1) {
				calcFeetAndInches(feet, 0);
			} else {
				System.out.println("No Values Entered");
			}
		input = new Scanner(System.in);
		System.out.println("Would you like to Enter more Numbers? (Yes / No)");
		String choice = input.nextLine();
		if (choice.toLowerCase().equals("no")) {
			running = false;
		}
	
	}
}
//Number of Parameters must change for method overloading.
	
	//Challenge
	public static double calcFeetAndInches(double feetToInches, double inches) {
		if (feetToInches >= 0d && inches >=0d && inches <=12d) {
			double totalCentimeteres = ((feetToInches * 12d) + inches) * 2.54;
			System.out.println("Total Centimeteres: " + totalCentimeteres);
			return totalCentimeteres;
		}
			System.out.println("Invalid Feet or Inches entry.");
			//Negative 1 is a good return, for when an error is encountered.
			return -1d;
	}	
	public static double calcFeetAndInches(double inches) {
		if (inches >=0) {
			double feet = inches / 12d;

			return calcFeetAndInches(feet, 0d);
		}
		System.out.println("Invalid Feet or Inches entry.");
			return -1d;
	}
}	