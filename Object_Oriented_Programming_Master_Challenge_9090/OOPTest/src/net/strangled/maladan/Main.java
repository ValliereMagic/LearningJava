package net.strangled.maladan;
import java.util.Scanner;
public class Main {
	public static Scanner input;
	public static void main(String[] args) {
		newCustomer();
	}
	public static void newCustomer() {
		input = new Scanner(System.in);
		System.out.println("Welcome to Bill's Burgers! What can we get for ya? (Basic_Burger, Healthy_Burger, Deluxe_Combo");
		String choice = input.nextLine();
		switch(choice.toLowerCase()) {
			case("basic_burger"):
				basicBurger();
			break;
			case("healthy_burger"):
				healthyBurger();
			break;
			case("deluxe_combo"):
				deluxeCombo();
			break;
		}
	}
	public static void goodBye() {
		System.out.println("Thanks for visiting!");
	}
	public static boolean choiceBooleanConvert(String choice) {
		boolean turn;
		if(choice.toLowerCase().equals("yes")) {
			turn = true;
		} else if (choice.toLowerCase().equals("no")) {
			turn = false;
		} else {
			turn = false;
		}
		return turn;
	}
	public static void basicBurger() {
		BurgerQ burgerQ = new BurgerQ();
		burgerQ.Questionaire();
		BasicBurger burger = new BasicBurger(burgerQ.getBunType(), burgerQ.isLettuce(), burgerQ.isTomato(), burgerQ.isCarrot());
		burger.getBurgerPrice();
		goodBye();	
	}
	public static void deluxeCombo() {
		boolean combo = true;
		DeluxeBurger burger = new DeluxeBurger(combo);
		burger.getBurgerPrice();
		goodBye();
	}
	public static void healthyBurger() {
		boolean pickle;
		boolean onion;
		BurgerQ burgerQ = new BurgerQ();
		burgerQ.Questionaire();
		System.out.println("Would you like pickle on it? (Yes / No");
		String choice = input.nextLine();
		pickle = choiceBooleanConvert(choice);
		System.out.println("Would you like onion on it? (Yes / No");
		choice = input.nextLine();
		onion = choiceBooleanConvert(choice);
		HealthyBurger burger = new HealthyBurger(burgerQ.isLettuce(), burgerQ.isTomato(), burgerQ.isCarrot(), pickle, onion);
		burger.getBurgerPrice();
		goodBye();
	}
}
