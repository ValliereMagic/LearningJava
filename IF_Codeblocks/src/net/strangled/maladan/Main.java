package net.strangled.maladan;
import java.util.Scanner;

public class Main {
	
	public static Scanner input;
	
	public static void main(String[] args) {	
		boolean blarg = true;
		while (blarg == true) {
			input = new Scanner(System.in);
			System.out.println("Enter your Username:");
			String username = input.nextLine();
			System.out.println("Enter your Score: ");
			int score = input.nextInt();
			gameIsOver(username, score);
			input = new Scanner(System.in);
			System.out.println("Would you like to check another score? (yes/no): ");
			String continuation = input.nextLine();
			if (continuation.equals ("yes")) {
				blarg = true;
			} else {
				blarg = false;
				System.out.println("Goodbye.");
			}
		}
	}
	public static void gameIsOver(String player, int score) {
		int position;
		position = calculateHighScorePosition(score);
		displayHighScorePosition(player, position, score);
	}
	public static int calculateHighScorePosition(int playerScore) {
		int position;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			position = 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			position = 3;
		} else {
			position = 4;
		}
		return position;
	}
	public static void displayHighScorePosition(String playername, int position, int score) {
		System.out.println(playername + " Managed to achieve position: " + position + " With a score of: " + score + " Points!");
	}
}