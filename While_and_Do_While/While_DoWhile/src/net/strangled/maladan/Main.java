package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 5) {
			System.out.println("Count value is: " + count);
			count++;
		}
		count = 1;
		while(true) {
			if(count >= 6) {
				break;
			}
			System.out.println("Count value is: " + count);
			count++;
		}
		count = 6;
		do {
			 System.out.println("Count was " + count);
			 count++;
			 if(count >100) {
				 break;
			 }
		 }	while(count != 6);
		
		
		int blarg = 0;
		int finalBlarg = 100;
		int evenTotal = 0;
		while (blarg <=finalBlarg) {
			if (!isEvenNumber(blarg)) {
				blarg++;
				continue;
			}
			System.out.println("Even Number " + blarg);
			evenTotal++;
			blarg++;
				if (evenTotal >= 5) {
					break;
				}
		}
		System.out.println(evenTotal + " Even numbers have been found.");
	
	}
	public static boolean isEvenNumber(int number) {
		if ((number % 2) == 0 && number != 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
