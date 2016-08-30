package net.strangled.maladan;

public class Quadratic {
	private double a1;
	private double a2;
	public Quadratic(double a, double b, double c) {
			calc(a, b, c);
		}
	private void calc(double a, double b, double c) {
		double d = Math.sqrt((Math.pow(b, 2)) - (4*a*c));
		this.a1 = (-1*(b) + d) / (2*a);
		this.a2 = (-1*(b) - d) / (2*a);
	}
	public double getA1() {
		return a1;
	}
	public double getA2() {
		return a2;
	}
}
