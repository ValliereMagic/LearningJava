package net.strangled.maladan;

public class HealthyBurger extends BasicBurger{
	private boolean pickle;
	private boolean onion;
	private double price;
	private double onionPrice = 0.10;
	private double picklePrice = 0.10;
	public HealthyBurger(boolean lettuce, boolean tomato, boolean carrot, boolean pickle, boolean onion) {
		super("Rye", lettuce, tomato, carrot);
		this.price = super.getPrice();
		this.price -= 0.50;
		this.pickle = pickle;
		this.onion = onion;
		if (pickle == true) {
			this.price += 0.50;
		}
		if (onion == true) {
			this.price += 0.25;
		}
	}
	public boolean isPickle() {
		return pickle;
	}
	public boolean isOnion() {
		return onion;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void getBurgerPrice() {
		System.out.println("Basic Burger: " + super.getBasicBurgerCost());
		if(super.isLettuce() == true) {
			System.out.println("Lettuce: " + super.getLettucePrice());
		}
		if (super.isCarrot() == true) {
			System.out.println("Carrot: " + super.getCarrotPrice());
		}
		if (super.isTomato() == true) {
			System.out.println("Tomato: " + super.getTomatoPrice());
		}
		if (this.onion == true) {
			System.out.println("Onion: " + this.onionPrice);
		}
		if (this.pickle == true) {
			System.out.println("Pickle: " + this.picklePrice);
		}
		System.out.println("Total cost: " + this.price);
	}
}
