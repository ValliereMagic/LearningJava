package net.strangled.maladan;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Adam", 54.96);
		Customer anotherCustomer;
		anotherCustomer = customer;
		//This is a pointer ^^ (to the original customer)
		anotherCustomer.setBalance(12.18);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(4);
		printList(intList);
		
		System.out.println("");
		
		intList.add(1, 2);
		printList(intList);
	}
	private static void printList(ArrayList<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println("Index: " + i + " Value: " + intList.get(i));
		}
	}
}
