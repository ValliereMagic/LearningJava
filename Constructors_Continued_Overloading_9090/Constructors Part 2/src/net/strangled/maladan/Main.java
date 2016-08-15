package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		//values updated in constructor rather than being set at a later time.
		vipBlarg vip = new vipBlarg("Hydra", 10000, "noot@noot.noot");
		System.out.println(vip.getName());
		System.out.println(vip.getCreditLimit());
		System.out.println(vip.getEmailAddress());
		System.out.println("*********************************************");
		vip = new vipBlarg();
		System.out.println(vip.getName());
		System.out.println(vip.getCreditLimit());
		System.out.println(vip.getEmailAddress());
		System.out.println("*********************************************");
		vip = new vipBlarg("noot", "nootnoot");
		System.out.println(vip.getName());
		System.out.println(vip.getCreditLimit());
		System.out.println(vip.getEmailAddress());
		System.out.println("*********************************************");
	}
	
}
