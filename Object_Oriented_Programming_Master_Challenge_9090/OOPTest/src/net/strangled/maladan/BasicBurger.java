package net.strangled.maladan;

public class BasicBurger {
	private String bunType;
	private boolean lettuce;
	private boolean tomato;
	private boolean carrot;
	private double price;
	private double lettucePrice = 0.10;
	private double tomatoPrice = 0.15;
	private double carrotPrice = 0.12;
	private double basicBurgerCost = 5.00;
	public BasicBurger(String bunType, boolean lettuce, boolean tomato, boolean carrot) {
		if(bunType != null) {
			price += basicBurgerCost;
			this.bunType = bunType;
		}
		if(lettuce == true) {
			price += lettucePrice;
			this.lettuce = lettuce;
		} else {
			this.lettuce = false;
		}
		if (tomato == true) {
			price += tomatoPrice;
			this.tomato = true;
		} else {
			this.tomato = false;
		}
		if (carrot == true) {
			price += carrotPrice;
			this.carrot = true;
		} else {
			this.carrot = false;
		}
	}
	public String getBunType() {
		return bunType;
	}
	public boolean isLettuce() {
		return lettuce;
	}
	public boolean isTomato() {
		return tomato;
	}
	public boolean isCarrot() {
		return carrot;
	}
	public double getPrice() {
		return price;
	}
	public double getLettucePrice() {
		return lettucePrice;
	}
	public double getTomatoPrice() {
		return tomatoPrice;
	}
	public double getCarrotPrice() {
		return carrotPrice;
	}
	public double getBasicBurgerCost() {
		return basicBurgerCost;
	}
	public void getBurgerPrice() {
		System.out.println("Basic Burger: " + this.basicBurgerCost);
		if(this.lettuce == true) {
			System.out.println("Lettuce: " + this.lettucePrice);
		}
		if (this.carrot == true) {
			System.out.println("Carrot: " + this.carrotPrice);
		}
		if (this.tomato == true) {
			System.out.println("Tomato: " + this.tomatoPrice);
		}
		System.out.println("Total cost: " + this.price);
	}
	
}
