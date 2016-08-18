package net.strangled.maladan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, InterruptedException {
		@SuppressWarnings("unused")
		boolean running = true;
		double initialTime = getTime();
		while (running = true) {
			oneSecond();
			initialTime ++;
			if (initialTime % 300 == 0) {
				writeFile(initialTime);
				System.out.println("Time saved.");
			}
		}
	}
	public static void saver(int time) throws FileNotFoundException, UnsupportedEncodingException {
		writeFile(time);
	}
	public static void oneSecond() throws InterruptedException {
		Thread.sleep(1000);
	}
	public static double getTime() throws FileNotFoundException {
		double time = readFile();
		return time;
	}
	public static void writeFile(double time) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("Time_Log.mal", "UTF-8");
		writer.println(time);
		writer.close();
	}
	public static double readFile() throws FileNotFoundException {
		Scanner timeIn = new Scanner(new File("Time_Log.mal"));
		double time = 0;
		while(timeIn.hasNextDouble()) {
			time = timeIn.nextDouble();
		}
		timeIn.close();
		return time;
	}
}