package net.strangled.maladan;

public class DeluxeBurger {
	private boolean chips;
	private boolean drink;
	private double price;
	private BasicBurger deluxeBurger;
	private boolean combo;
	private double comboPrice = 2.00;
	public DeluxeBurger(boolean combo) {
		this.deluxeBurger = new BasicBurger("Sesame", false, false, false);
		this.price = (deluxeBurger.getPrice());
		this.combo = combo;
		if (this.combo == true) {
			this.chips = true;
			this.drink = true;
			this.price += comboPrice;
		}
	}
	public boolean isChips() {
		return chips;
	}
	public boolean isDrink() {
		return drink;
	}
	public double getPrice() {
		return price;
	}
	public void getBurgerPrice() {
		System.out.println("Basic Burger: " + deluxeBurger.getBasicBurgerCost());
		if (this.combo == true) {
			System.out.println("Combo:" + comboPrice);
		}
		System.out.println("Total cost: " + this.price);
	}
}

