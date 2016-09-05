package net.strangled.maladan;
import java.util.ArrayList;
public class Customer {
	private int branchKey;
	private int nameSetCounter = 0;;
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	public Customer(String name, double transaction, int branchKey) {
		this.name = name.toLowerCase();
		this.branchKey = branchKey;
		this.transactions.add(Double.valueOf(transaction));
	}
	public String getName() {
			return name;
	}
	public void setName(String name) {
		if(nameSetCounter < 3) {
			this.name = name.toLowerCase();
		}
	}
	public void addTransaction(double amount, int branchKey) {
		if(branchKey == this.branchKey) {
			this.transactions.add(Double.valueOf(amount));
		}
	}
	public double[] listTransactions() {
		double[] transactions = new double[this.transactions.size()];
		for(int i = 0; i < this.transactions.size(); i++) {
			transactions[i] = this.transactions.get(i).doubleValue();
		}
		return transactions;
	}
}