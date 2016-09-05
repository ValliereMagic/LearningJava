package net.strangled.maladan;
import java.util.ArrayList;
public class BankOfBlarg {
	private String bankName;
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	public void makeBank(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public boolean makeNewBranch(String name) {
		if(getBranch(name) == null) {
			Branch branch = new Branch();
			branch.makeBranch(name);
			branches.add(branch);
			return true;
		} else {
			return false;
		}
	}
	public void listBranches() {
		for(int i = 0; i < branches.size(); i ++) {
			System.out.println(branches.get(i).getBranchName());
		}
	}
	public boolean addCustomerToBranch(String branchname, String customerName, double initialTransaction) {
		Branch branch = getBranch(branchname);
		if(branch != null) {
			branch.addCustomer(customerName, initialTransaction);
			return true;
		} else {
			return false;
		}
	}
	public boolean addTransactionToCustomer(String branchname, String customerName, double transaction) {
		Branch branch = getBranch(branchname);
		if(branch != null) {
			branch.addNewTransaction(customerName, transaction);
			return true;
		} else {
			return false;
		}
	}
	public String listClientsInBranch(String branchName) {
		Branch branch = getBranch(branchName);
		if(branch != null) {
		String[] names = branch.listCustomersInBranch();
		for(String name: names) {
			System.out.println(name);
		}
		return "Blarg";
		} else {
			return null;
		}
	}
	public String listClientTransactionsInBranch(String branchName, String customername) {
		Branch branch = getBranch(branchName);
		if(branch != null) {
			double[] transactions = branch.listCustomerTransactions(customername);
			String blarg = "('";
			for(double d: transactions) {
				blarg += (d + ", ");
			}
			blarg += "')";
			return blarg;
		} else {
			return null;
		}
	}
	private Branch getBranch(String name) {
		Branch branch = null;
		for(Branch b: branches) {
			if(b.getBranchName().equals(name.toLowerCase())) {
				branch = b;
			}
		}
		return branch;
	}
}