package net.maladan.strangled;

public class Main {

	
	// Common operators.
	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		
		int previousResult = result;
		result --;
		System.out.println(previousResult +" - 1 = " + result);
		
		previousResult = result;
		
		result = result * 10;
		System.out.println(previousResult + " * 10 " + result);
		
		
		previousResult = result;
		
		result = result  /5;
		System.out.println(previousResult + " / 5 " + result);
		
		previousResult = result;
		result = result % 3;
		
		System.out.println(previousResult + " % 3 " + result);
		
		previousResult = result;
		result ++;
		System.out.println("Result is now " + result);
		
		result +=2;
		result -=2;
		result *=10;
		result /=10;
		
		
		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("Is not an alien.");
		else
			System.out.println("Is an alien.");
		
		
		int topScore = 80;
		if (topScore == 100){
			System.out.println("blarg.");
			topScore++;
			System.out.println(topScore);
		}else{
			System.out.println("system failure");
			}
		int secondTopScore = 95;
		if ((topScore > secondTopScore) && (topScore <100)){
			System.out.println("Greater top score and less than 100");
		}
		
		// OR is ||
		if((topScore > 90) || (secondTopScore <=90)) {
			System.out.println("One of these tests is true.");
		}
		int newValue = 50;
		
		if (newValue == 50) {
			System.out.println("This is true");
		}
		boolean isCar = true;
		if (isCar == true) {
			System.out.println("This should not be executed.");
		}
		
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true.");
			
		
		}
		System.out.println(hydra());
	}
	public static double hydra() {
		double num1 = 20d;
		double num2 = 80d;
		double num3 = (num1 + num2) * 25d;
		double result = num3 % 40d;
		if (result <=20d) {
			System.out.println("Total was under the limit.");
			return result;
		}else{
			return num2;
		}
		
	
	}

}
