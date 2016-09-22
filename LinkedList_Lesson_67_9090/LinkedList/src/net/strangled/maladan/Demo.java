package net.strangled.maladan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities) {
    	Scanner input = new Scanner(System.in);
    	boolean quit = false;
    	boolean goingForward = true;
    	ListIterator<String> listIterator = cities.listIterator();
    	
    	if(cities.isEmpty()) {
    		System.out.println("No cities provided.");
    		input.close();
    		return;
    	} else {
    		System.out.println("Now visiting " + listIterator.next());
    		printMenu();
    	}
    	
    	while(!quit) {
    		int action = input.nextInt();
    		input.nextLine();
    		switch(action) {
    			case 0:
    				System.out.println("Holiday over.");
    				quit = true;
    				input.close();
    				break;
    			case 1:
    				if(!goingForward) {
    					if(listIterator.hasNext()) {
    						listIterator.next();
    						goingForward = true;
    					}
    				}
    				//only execute if the list as another entry after the current one.
    				if(listIterator.hasNext()) {
    					//move over and print out the next entry.
    					System.out.println("Now visiting " + listIterator.next());
    				} else {
    					System.out.println("Reached the end of the list.");
    					goingForward = false;
    				}
    				break;
    			case 2:
    				if(goingForward) {
    					if(listIterator.hasPrevious()) {
    						listIterator.previous();
    					}
    					goingForward = false;
    				}
    				//only execute if there is an entry in the list before the current one
    				if(listIterator.hasPrevious()) {
    					//go back and print the previous value.
    					System.out.println("Now visiting " + listIterator.previous());
    				} else {
    					System.out.println("We are at the start of the list.");
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
    	System.out.println("Choose one of the following.");
    	System.out.println("\t(0.) Quit.");
    	System.out.println("\t(1.) Move to the next city.");
    	System.out.println("\t(2.) move back to the previous city.");
    	System.out.println("\t(3.) Print program instructions.");
    }
}
