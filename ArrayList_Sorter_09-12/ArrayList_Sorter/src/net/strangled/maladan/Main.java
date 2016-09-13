package net.strangled.maladan;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a list of numbers separated by commas, and ends in a semicolon.");
		String list = input.nextLine();
		String sorted = "";
		ArrayList<Double> unsortedList = new ArrayList<Double>();
		for(int i = 0; i < list.length(); i++) {
			if(list.charAt(i) != ',' && list.charAt(i) != ';') {
				sorted += list.charAt(i);
			} else if(list.charAt(i) == ';' || list.charAt(i) == ',') {
				unsortedList.add(Double.valueOf(sorted));
				sorted = "";
			}
		}
		unsortedList = sortArray(unsortedList);
		for(Double i: unsortedList) {
			System.out.println(i);
		}
	}
	public static ArrayList<Double> sortArray(ArrayList<Double> unsorted) {
	boolean counter = true;
	while(counter) {
		counter = false;
		int latter = 1;
		int former = 0;
		for(int i = 0; i < unsorted.size()-1; i++) {
				if(unsorted.get(unsorted.size()-1-former) > unsorted.get(unsorted.size()-1-latter)) {
					double temp = unsorted.get(unsorted.size()-1-latter);
					double temp2 = unsorted.get(unsorted.size()-1-former); 
					unsorted.set((unsorted.size()-1-latter), temp2);
					unsorted.set((unsorted.size()-1-former), temp);
					counter = true;
				}
				latter ++;
				former ++;
		}
	}
		return unsorted;
	}
}