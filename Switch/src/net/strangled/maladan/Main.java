package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		int value = 1;
		if (value == 1) {
			System.out.println("Value Was one.");
		} else if (value == 2) {
			System.out.println("Value Was 2.");
		} else {
			System.out.println("Was not 1 or 2.");
		}
		
		int switchValue = 1;
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1.");
				break;
			case 2:
				System.out.println("Value was 2.");
				break;
			
			case 3: case 4: case 5:
				System.out.println("Was a 3, 4, or 5.");
				System.out.println("Actually it was a " + switchValue);
				break;
			
			default:
				System.out.println ("Was not 1 or 2.");
				break;
		//Switch can only do cases for a single variable.
		}
			
		//More code here
		//Challenge
	
		
		char challenger = 'E';
		
		switch(challenger) {
			case 'A':
				System.out.println("The character was an 'A'.");
				break;
			case 'B':
				System.out.println("The character was a 'B'.");
				break;
			case 'C':
				System.out.println("The character was a 'C'.");
				break;
			case 'D':
				System.out.println("The character was an 'D'.");
				break;
			default:
				System.out.println("No Valid character was found.");
				break;
		}
		
		String month = "January";
		switch(month.toLowerCase()) {
			case "january":
				System.out.println("Blarg");
				break;
			case "june":
				System.out.println("JUNE");
				break;
		
		}
	
	}

}
