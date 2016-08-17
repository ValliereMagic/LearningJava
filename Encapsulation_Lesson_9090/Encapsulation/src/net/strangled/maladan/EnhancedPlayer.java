package net.strangled.maladan;

public class EnhancedPlayer {
	private String name;
	private int health= 100;
	private String weapon;
	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.name = name;
		if(health>0 && health <= 100) {
			this.health = health;
		}
		this.weapon = weapon;
	}
	public void loseHealth(int damage) {
		this.health -= damage;
		if(this.health <=0) {
			System.out.println("Player has died.");
			//reduce number of lives remaining for the player
		}
	}
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public String getWeapon() {
		return weapon;
	}
}
