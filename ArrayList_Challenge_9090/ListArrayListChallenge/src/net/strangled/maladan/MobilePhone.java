package net.strangled.maladan;

import java.util.ArrayList;
public class MobilePhone {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public void addContact(String name, String phoneNumber) {
		Contact temp = new Contact(name, phoneNumber);
		boolean flag = false;
		if(contacts.size() <= 0) {
			contacts.add(temp);
			flag = true;
			successful(true);
		}
		if(flag != true) {
			for(Contact con: contacts) {
				if(!con.getName().equals(name)) {
					contacts.add(temp);
					temp = con;
					successful(true);
					break;
				}
			}
			if(temp.getName().equals(name)) {
				successful(false);
		}
		}
	}
	public void modifyContact(String name1, String name2, String phoneNumber2) {
		Contact test = findContact(name1);
		if(test != null) {
			test.setName(name2);
			test.setPhoneNumber(phoneNumber2);
			successful(true);
		}
		else {
			successful(false);
		}
	}
	public void removeContact(String name) {
		Contact temp= null;
		for(Contact con: contacts) {
			if(con.getName().equals(name)) {
				contacts.remove(con);
				temp = con;
				successful(true, "remove");
				break;
			}
		}
		if(temp == null) {
				successful(false, "remove");
		}
	}
	public void listContacts() {
		for(int i = 0; i < contacts.size(); i++) {
			String name = contacts.get(i).getName();
			String number = contacts.get(i).getPhoneNumber();
			System.out.println(name + " : " + number);
		}
	}
	public Contact findContact(String name) {
		for(Contact con: contacts) {
			if(con.getName().equals(name)) {
				return con;
			}
		}
		return null;
	}
	private void successful(boolean test) {
		if(test) {
			System.out.println("Contact added successfully.");
		} else {
			System.out.println("Adding contact failed.");
		}
	}
	private void successful(boolean test, String remove) {
		if(test) {
			System.out.println("Contact removed successfully.");
		} else {
			System.out.println("Removing contact failed.");
		}
	}
}