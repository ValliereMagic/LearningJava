package com.maladan.strangled.net;

public class Main {

	public static void main(String[] args) {
		//byte
		//short
		//integer
		//long
		//float
		//double
		//char
		//boolean
		
		//String
		String myString = "blarg";
		myString = myString + ", Hail hydra.";
		System.out.println(myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		//printed just as characters put together
		
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("lastString is equal to " + lastString);
		
	}

}
