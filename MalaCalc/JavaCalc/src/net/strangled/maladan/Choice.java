package net.strangled.maladan;

public class Choice extends Main{
	private int choice;
	private boolean running;
	private double a;
	private double b;
	private double c;
	public Choice() {
		System.out.println("Enter your choice: ");
		this.choice = input.nextInt();
		input.nextLine();
		if(this.choice == 9) {
			this.running = false;
		} else {
			this.running = true;
		}
	}
	public int getChoice() {
		return choice;
	}
	public boolean isRunning() {
		return running;
	}
	public void calculate(int choice) {
		Calculate calculate = new Calculate();
		switch(choice) {
			case 1:
				System.out.println("Enter the two numbers to add.");
				getTwoNumbers();
				System.out.println("The answer is: " + calculate.add(this.a, this.b));
				break;
			case 2:
				System.out.println("Enter the two numbers to subtract.");
				getTwoNumbers();
				System.out.println("The answer is: " + calculate.subtract(this.a, this.b));
				break;
			case 3:
				System.out.println("Enter the two numbers to multiply.");
				getTwoNumbers();
				System.out.println("The answer is: " + calculate.multiply(this.a, this.b));
				break;
			case 4:
				System.out.println("Enter the two numbers to divide.");
				getTwoNumbers();
				System.out.println("The answer is: " + calculate.divide(this.a, this.b));
				break;
			case 5:
				System.out.println("Enter variables: a, b, and c.");
				System.out.println("Enter variable a: ");
				this.a = input.nextDouble();
				System.out.println("Enter variabe b: ");
				this.b = input.nextDouble();
				System.out.println("Enter variable c: ");
				this.c = input.nextDouble();
				input.nextLine();
				Quadratic quadratic = new Quadratic(this.a, this.b, this.c);
				System.out.println("Solution 1: " + quadratic.getA1());
				System.out.println("Solution 2: " + quadratic.getA2());
				break;
			case 6:
				instructions.getInstructions();
				break;
			case 7:
				System.out.println("Enter the base and the exponent.");
				getTwoNumbers();
				System.out.println("The answer is: " + calculate.power(this.a, this.b));
				break;
			case 8:
				System.out.println("Enter the number to square root.");
				this.a = input.nextDouble();
				input.nextLine();
				System.out.println("The answer is: " + calculate.sqrt(this.a));
				break;
		}
	}
	public void getTwoNumbers() {
		System.out.println("Enter number 1: ");
		this.a = input.nextDouble();
		System.out.println("Enter number 2:");
		this.b = input.nextDouble();
		input.nextLine();
	}
}
