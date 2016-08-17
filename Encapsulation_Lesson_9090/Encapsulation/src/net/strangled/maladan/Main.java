package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.fullName = "tim";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Player health = " + player.healthRemaining());
		damage = 11;
		player.loseHealth(damage);
		System.out.println("Player health = " + player.healthRemaining());
		System.out.println("____________________________________");
		EnhancedPlayer player2 = new EnhancedPlayer("Blarg", 50, "Sword");
		System.out.println("Initial health is " + player2.getHealth());
	}

}
