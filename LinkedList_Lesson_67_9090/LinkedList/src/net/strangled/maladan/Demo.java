package net.strangled.maladan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {
	
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin");
		printList(placesToVisit);
		visit(placesToVisit);
	}
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now Visiting: " + i.next());
		}
		System.out.println("Done");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while (stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				//equal do not add.
				System.out.println(newCity + ": is already a destination.");
				return false;
			} else if (comparison > 0) {
				//new city should appear before this one.
				//Brisbane -> Adelaide
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if (comparison < 0) {
				// move on to the next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList<String> data) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		//important
		boolean goingForward = true;
		ListIterator<String> listIterator = data.listIterator();
		if (data.isEmpty()) {
			System.out.println("No cities are in the list.");
			scanner.close();
			return;
		} else {
			System.out.println("Now Visiting: " + listIterator.next());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
				case 0:
					System.out.println("Hoilday Over.");
					quit = true;
					scanner.close();
					break;
				case 1:
					//important
					if(!goingForward) {
						if (listIterator.hasNext()) {
							//have to double next, when switching direcitons.
							listIterator.next();
						}
						goingForward = true;
					}
					if (listIterator.hasNext()) {
						System.out.println("Now Visiting: " + listIterator.next());
					} else {
						System.out.println("Reached the end of the list.");
						//can no longer go forwards.
						goingForward = false;
					}
					break;
				case 2:
					//important
					if (goingForward) {
						if(listIterator.hasPrevious()) {
							//have to double previous when switching directions.
							listIterator.previous();
						}
						goingForward = false;
					}
					if (listIterator.hasPrevious()) {
						// won't work. This will display the entry just displayed.
						System.out.println("Now Visiting: " + listIterator.previous());
					} else {
						System.out.println("Reached the start of the list.");
						//can no longer go backwards.
						goingForward = true;
					}
					break;
				case 3:
					printMenu();
					break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\n"
				+ "0 - to quit.\n"
				+ "1 - go to next city.\n"
				+ "2 - go to previus city.\n"
				+ "3 - print menu options.");
	}
}
