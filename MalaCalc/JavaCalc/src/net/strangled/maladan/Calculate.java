package net.strangled.maladan;

public class Calculate {
	public double add(double a, double b) {
		double c = a + b;
		return c;
	}
	public double subtract(double a, double b) {
		double c = a - b;
		return c;
	}
	public double multiply(double a, double b) {
		double c = a * b;
		return c;
	}
	public double divide(double a, double b) {
		double c = a / b;
		return c;
	}
	public double power(double a, double b) {
		double c = Math.pow(a, b);
		return c;
	}
	public double sqrt(double a) {
		double b = Math.sqrt(a);
		return b;
	}
}