import java.util.Scanner;
public class HelloWorld {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		String blarg = "Hello";
		input = new Scanner(System.in);
		String World = reqName();
		outFunction(blarg, World);
		Calculation();
			
	}
	public static String reqName() {
		System.out.println("Please Enter your name.");
		String nameEntry = input.nextLine();
		return nameEntry;
	}
	public static void outFunction(String blarg, String blaeg) {
		System.out.println(blarg + " " + blaeg + ".");
	
	}
	public static void  Calculation(){
		int num1 = (10 + 5) + (2* 10);
		int num2 = 12 + num1;
		int num3 = num1 * 2 + num2;
		int challenge = 1000 - num3;
		System.out.println("Calculation = " + num3);
		System.out.println("Challenge Number = " + challenge);
	}
}
