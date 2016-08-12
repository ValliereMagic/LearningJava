package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
	calculateScore("ValliereMagic", 500);
	calculateScore(5000);
	calculateScore(12);
	
	calcFeetAndInches(6, 10);	
	calcFeetAndInches(70);
	}
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " Scored " + score + " Points.");
		return score * 1000;
	}
	public static int calculateScore(int score) {
	System.out.println("Unknown Plaver" + " Scored " + score + " Points.");
	return score * 1000;
	}
	public static int calculateScore() {
		return 0;
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
			return -1d;
	}	
	public static double calcFeetAndInches(double inches) {
		if (inches >=0) {
			double feet = inches / 12d;
			double answer =calcFeetAndInches(feet, 0d);
			return answer;
		}
			return -1d;
	}
}	