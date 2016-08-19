package net.strangled.maladan;

class BurgerQ extends Main {
	private String bunType;
	private boolean lettuce;
	private boolean tomato;
	private boolean carrot;
	public void Questionaire() {
		System.out.println("What type of bun would you like? (white, sesame, rye)");
		this.bunType = input.nextLine();
		System.out.println("Would you like lettuce on it? (Yes / No)");
		String choice = input.nextLine();
		this.lettuce = choiceBooleanConvert(choice);
		System.out.println("Would you like tomato on it? (Yes / No)");
		choice = input.nextLine();
		this.tomato = choiceBooleanConvert(choice);
		System.out.println("Would you like carrot on it? (Yes / No");
		choice = input.nextLine();
		this.carrot = choiceBooleanConvert(choice);
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
}
