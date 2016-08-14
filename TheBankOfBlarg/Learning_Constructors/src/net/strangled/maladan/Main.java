package net.strangled.maladan;
import java.util.Scanner;
public class Main {
	public static Scanner input = new Scanner(System.in);
	public static BankOfBlarg Customer1 = new BankOfBlarg();
	public static void main(String[] args) {
		boolean system = true;
			while (system == true) {
				boolean running = true;
				System.out.println("Are you new to the bank of blarg? (yes / no)");
				String choice = input.nextLine();
				if (choice.toLowerCase().equals("yes")) {
					newCustomer();
				}
					while (running != false) {
						System.out.println("What would you like to do? Options: (Transaction, Account_Number, Account_Balance, Name, Email, Phone, Exit");
						input = new Scanner(System.in);
						String choiceA = input.nextLine();
						running = choice(choiceA);
					}
			}
	}
	public static boolean choice(String selection) {
		if (selection.toLowerCase().equals("transaction")) {
			withdrawlDeposit();
		} else if (selection.toLowerCase().equals("account_number")) {
			getAccountNumber();
		} else if (selection.toLowerCase().equals("account_balance")) {
			getAccountBalance();
		} else if (selection.toLowerCase().equals("name")) {
			getName();
		}else if (selection.toLowerCase().equals("email")) {
			getEmail();
		}else if (selection.toLowerCase().equals("phone")) {
			getPhone();
		}else if (selection.toLowerCase().equals("exit")) {
			return false;
		} else {
			System.out.println("Invalid Entry.");
			return true;
		}
		return true;
	}
	
	public static void newCustomer() {
		boolean pinConfirm = false;
		int pin = -1;
		System.out.println("Thank you for choosing the Bank of Blarg! To get started please enter your full name below. ('John/Jane Doe')");
		String name = input.nextLine();
		System.out.println("Now please enter your email.");
		String email = input.nextLine();
		System.out.println("Now please enter your phone number. ( (###) ###-#### )");
		String phoneNumber = input.nextLine();
		while (pinConfirm == false) {
			System.out.println("Now please enter a pin to secure your account with.");
			int pinAttempt1 = input.nextInt();
			System.out.println("Type your pin again to confirm it is correct.");
			int pinAttempt2 = input.nextInt();
				if (pinAttempt1 == pinAttempt2) {
					pin = pinAttempt1;
					pinConfirm = true;
				} else {
					System.out.println("Pins do not match.");
				}
					
		}
		Customer1.setPin(pin);
		int accountNumber = (int)(Math.random()*9000)+1000;
		Customer1.setAccountNumber(accountNumber);
		System.out.println("Your account number is: " + accountNumber + ". Store it somewhere safe.");
		Customer1.setCustomerName(name, pin);
		Customer1.setCustomerEmail(pin, email);
		Customer1.setPhoneNumber(pin, phoneNumber);
	}
	public static int pin(){
		System.out.println("What is your Pin?");
		int pin = input.nextInt();
		return pin;
	}
	public static void getAccountNumber() {
		int pin = pin();
		System.out.println("Your account number is: " + Customer1.getAccountNumber(pin));
	}
	public static void getAccountBalance() {
		int pin = pin();
		System.out.println("Your account balance is: " + Customer1.getAccountBalance(pin));
	}
	public static void getName() {
		int pin = pin();
		System.out.println("Your name is: " + Customer1.getCustomerName(pin));
	}
	public static void getEmail() {
		int pin = pin();
		System.out.println("Your email is: " + Customer1.getCustomerEmail(pin));
	}
	public static void getPhone() {
		int pin = pin();
		System.out.println("Your phone number is: " + Customer1.getPhoneNumber(pin));
	}
	
	public static void auth_Money_Handler(double Amount, int type) {
		int pin = pin();
		System.out.println("What is your account number?");
		int accountNum = input.nextInt();
		if (type == 1) {
			Customer1.depositFunds(pin, accountNum, Amount);
		} else if (type == -1) {
			Customer1.withdrawFunds(pin, accountNum, Amount);
		  }
	}
	
	
	public static void withdrawlDeposit() {
		System.out.println("Would you like to Deposit or Withdraw? (deposit / withdraw)");
		String choice = input.nextLine();
		
		if (choice.toLowerCase().equals("deposit")) {
			System.out.println("How much currency would you like to deposit? (#.##)");
			double depositAmount = input.nextDouble();
			auth_Money_Handler(depositAmount, 1);

		} else if (choice.toLowerCase().equals("withdraw")) {
			System.out.println("How much currency would you like to withdraw from your account?");
			double withdrawAmount = input.nextDouble();
			auth_Money_Handler(withdrawAmount, -1);
		}
	}
}