package net.strangled.maladan;
import java.util.Scanner;
public class Main {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many integers would you like to sort?");
		int intAmount = input.nextInt();
		int[] unsorted = getIntegers(intAmount);
		int[] sorted = sortArray(unsorted);
		printArray(sorted);
	}
	public static int[] getIntegers(int arrayAmount) {
		int[] collect = new int[arrayAmount];
		for(int i = 0; i < collect.length; i++) {
			System.out.println("Enter an integer.");
			collect[i] = input.nextInt();
		}
		return collect;
	}
	public static int[] sortArray(int[] unsorted) {
	boolean counter = true;
	while(counter) {
		counter = false;
		int latter = 1;
		int former = 0;
		for(int i2 = 0; i2 < unsorted.length-1; i2++) {
				if(unsorted[unsorted.length-1-former] > unsorted[unsorted.length-1-latter]) {
					int temp = unsorted[(unsorted.length-1-latter)];
					unsorted[(unsorted.length-1-latter)] = unsorted[(unsorted.length-1-former)];
					unsorted[(unsorted.length-1-former)] = temp;
					counter = true;
				}
				latter ++;
				former ++;
		}
	}
		return unsorted;
	}
	public static void printArray(int[] sortedArray) {
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.println(i+1 + ": " + sortedArray[i]);
		}
	}
}