import java.util.Scanner;
public class Main {
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float myFLoatValue = 5f/3f;
		double myDoubleValue = 5d/3d;
		int myIntValue = 5/3;
		System.out.println("My Integer Value is " + myFLoatValue);
		System.out.println("My float value is " + myDoubleValue);
		System.out.println("My double value is " + myIntValue);
		
		System.out.println(uConversion());
		}
		public static double uConversion() {
			System.out.println("Enter a number in pounds to be converted into kilograms.");
			double pounds = input.nextDouble();
			double kilos = pounds * 0.45359237d;
			return kilos;
		}

}
