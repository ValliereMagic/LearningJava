package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		calculateInterest(10000.0d);
		System.out.println(primeOut());

	}
	public static void calculateInterest( double amount) {
			double interestRate = 8;
			int counter = 8;
		for(int i =8; i>=2; i--) {
			double Rate = (amount * (interestRate/100d));
			System.out.println("10,000 at " + counter + "% interest = " + Rate);
			interestRate --;
			counter--;
		}
		
	}
	public static String primeOut() {
		int counter= 0;
		for(int i = 1; i<=100000000; i++) {
			boolean pN = isPrime(i);
			if (pN == true) {
				counter++;
				System.out.println(i + " Is a prime number.");
				if (counter == 1000000) {
					break;
				}
			}	
		}
		return "1000000 Primes have been found.";
	}
	
	
	
	
	public static boolean isPrime(int n) {
		
		if (n == 1) {
			return false;
		}
		for(int i=2; i <= (long) Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
