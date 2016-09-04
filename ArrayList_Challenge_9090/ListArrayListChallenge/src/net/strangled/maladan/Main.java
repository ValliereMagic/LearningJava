package net.strangled.maladan;

import java.util.Scanner;

public class Main {
	private static boolean running;
	private static String name;
	private static String phoneNumber;
	private static Scanner input = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();
	public static void main(String[] Args) {
		running = true;
		while(running) {
			getInstructions();
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			input.nextLine();
			execute(choice);
		}
	}
	private static void getInstructions() {
		System.out.println("\nEnter your task:");
		System.out.println("\t(1.) Add new contact.");
		System.out.println("\t(2.) Modify an existing contact.");
		System.out.println("\t(3.) Remove a contact.");
		System.out.println("\t(4.) List all contacts.");
		System.out.println("\t(5.) Search for a contact.");
		System.out.println("\t(6.) Quit.");
	}
	private static void execute(int choice) {
		switch(choice) {
			case 1:
				getName();
				getPhoneNumber();
				phone.addContact(name, phoneNumber);
				break;
			case 2:
				getName();
				System.out.println("Enter new name eg.(Jane Doe): ");
				String name2 = input.nextLine();
				System.out.println("Enter new phone number eg. ((416) 555-5555): ");
				String phoneNumber2 = input.nextLine();
				phone.modifyContact(name, name2, phoneNumber2);
				break;
			case 3:
				getName();
				phone.removeContact(name);
				break;
			case 4:
				phone.listContacts();
				break;
			case 5:
				getName();
				Contact temp = phone.findContact(name);
				if(temp != null) {
					System.out.println(temp.getName() + " : " + temp.getPhoneNumber() + " Was found");
				} else {
					System.out.println("Entry not found.");
				}
				break;
			case 6:
				running = false;
				break;
		}
	}
	private static void getName() {
		System.out.println("Enter name eg.(Jane Doe): ");
		name = input.nextLine();
	}
	private static void getPhoneNumber() {
		System.out.println("Enter phone number eg. ((416) 555-5555): ");
		phoneNumber = input.nextLine();
	}
}