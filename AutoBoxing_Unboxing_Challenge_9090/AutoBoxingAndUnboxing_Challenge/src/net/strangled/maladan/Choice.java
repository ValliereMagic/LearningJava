package net.strangled.maladan;
public class Choice extends Main{
	public static void choice(int choice) {
		switch(choice) {
			case 0:
				input.nextLine();
				System.out.println("Enter a name for the new Bank.");
				String bankName = input.nextLine();
				bank.makeBank(bankName);
				System.out.println("Bank made successfully.");
				break;
			case 1:
				input.nextLine();
				System.out.println("Enter a name for the branch.");
				String branchName = input.nextLine();
				boolean successful = bank.makeNewBranch(branchName);
				successful(successful);
				break;
			case 2:
				input.nextLine();
				System.out.println("Enter the branch name.");
				branchName = input.nextLine();
				System.out.println("Enter the new customer's name.");
				String customerName = input.nextLine();
				System.out.println("Enter the customer's initial bank deposit. eg. (5.00)");
				double initialTransaction = input.nextDouble();
				input.nextLine();
				successful = bank.addCustomerToBranch(branchName, customerName, initialTransaction);
				successful(successful);
				break;
			case 3:
				input.nextLine();
				System.out.println("Enter the branch name.");
				branchName = input.nextLine();
				String clients = bank.listClientsInBranch(branchName);
				if (clients != null) {
					successful = true;
				} else {
					successful = false;
				}
				successful(successful);
				break;
			case 4:
				input.nextLine();
				System.out.println("Enter the branch name.");
				branchName = input.nextLine();
				System.out.println("Enter the customer's name.");
				customerName = input.nextLine();
				String transactions = bank.listClientTransactionsInBranch(branchName, customerName);
				if (transactions != null) {
					System.out.println(transactions);
					successful = true;
				} else {
					successful = false;
				}
				successful(successful);
				break;
			case 5:
				input.nextLine();
				System.out.println("Enter the branch name.");
				branchName = input.nextLine();
				System.out.println("Enter the customer name.");
				customerName = input.nextLine();
				System.out.println("Enter the transaction. eg. (5.00)");
				double transaction = input.nextDouble();
				input.nextLine();
				successful = bank.addTransactionToCustomer(branchName, customerName, transaction);
				successful(successful);
				break;
			case 6:
				Header_Instructions.programInstructions();
				break;
			case 7:
				input.nextLine();
				bank.listBranches();
				break;
			case 8:
				running = false;
				break;
		}
	}
	public static void successful(boolean successful) {
		if(successful) {
			System.out.println("Successful.");
		} else {
			System.out.println("Failed.");
		}
	}
}