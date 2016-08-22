package net.strangled.maladan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5, 6};
		//arrays start at 0!
		System.out.println(intArray[5]);
		int[] arrayInt = new int[50];
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = i*10;
		}
		//.length is good to use for filling arrays, when using for loops
		printArray(arrayInt);
		Valuable forLoop = new Valuable();
		forLoop.execute();
	}
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + ", value is " + array[i]);
		}
	}
}
class Valuable {
	private static Scanner input = new Scanner(System.in);
	public void execute() {
		int[] myIntegers = getIntegers(5);
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
		}
		System.out.println("The average is: " + getAverage(myIntegers));
	}
	private static int[] getIntegers(int count) {
		System.out.println("Enter " + count + " integer values.\r");
		int[] values = new int[count];
		for(int i=0; i<values.length; i++) {
			values[i] = input.nextInt();
			
		}
		return values;
	}
	private static double getAverage(int[] array) {
		int sumTotal = 0;
		for (int i = 0; i < array.length; i++) {
			sumTotal += array[i];
		}
		return (double) sumTotal / (double) array.length;
	}
}

