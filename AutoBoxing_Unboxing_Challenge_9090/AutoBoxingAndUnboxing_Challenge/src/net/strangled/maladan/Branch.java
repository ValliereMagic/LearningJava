package net.strangled.maladan;
import java.util.ArrayList;
public class Branch {
	private int branchKey;
	private String branchName;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	public void makeBranch(String branchName) {
		this.branchKey = (int) ((Math.random()*9000)+1000);
		this.branchName = branchName.toLowerCase();
	}
	public void addCustomer(String name, double initialDeposit) {
		Customer customer = new Customer(name, initialDeposit, this.branchKey);
		if(customers.size() <= 0) {
			customers.add(customer);
		} else {
			boolean flag = customerExists(name);
			if(!flag) {
				customers.add(customer);
			}
		}
	}
	public String getBranchName() {
		return branchName;
	}
	private Customer customerExists(String name, String i) {
		Customer custo = null;
		for(Customer cust: customers) {
			if(cust.getName().equals(name.toLowerCase())) {
				custo = cust;
			}
		}
		return custo;
	}
	private boolean customerExists(String name) {
		for(Customer cust: customers) {
			if(cust.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public void addNewTransaction(String name, double amount) {
		Customer customer = customerExists(name, "C");
		if(customer != null) {
			customer.addTransaction(amount, branchKey);
		}
	}
	public double[] listCustomerTransactions(String customerName) {
		Customer customer = customerExists(customerName, "C");
		return customer.listTransactions();
	}
	public String[] listCustomersInBranch() {
		String[] customerNames = new String[customers.size()];
		for(int i = 0; i < customers.size(); i++) {
			customerNames[i] = customers.get(i).getName();
		}
		return customerNames;
	}
}