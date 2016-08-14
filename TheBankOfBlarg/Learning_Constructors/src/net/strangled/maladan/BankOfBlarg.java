package net.strangled.maladan;
public class BankOfBlarg {
	private int accountNumber = 0;
	private double accountBalance = 0d;
	private String customerName = "";
	private String customerEmail = "";
	private String customerPhoneNum = "";
	private int nameChangeCount = 0;
	private int maxNameChangeCount = 2;
	private int pin = 0;
	
	
	
	public void setPin(int pin) {
		if (this.pin == 0 && pin != -1) {
			this.pin = pin;
			System.out.println("Pin set.");
		} else {
		System.out.println("A Pin can only be set once.");
		}
	}
	public void setAccountNumber(int accountNumber) {
		if (this.accountNumber == 0) {
			this.accountNumber = accountNumber;
			System.out.println("Account Number Set.");
		} else {
			System.out.println("Account Number can only be set once.");
		}
	}
	
	public int getAccountNumber(int pin) {
		if (pin == this.pin) {
			return this.accountNumber;
		} else {
			return -1;
		}
	}
	public double getAccountBalance(int pin) {
		if (pin == this.pin) {
			return this.accountBalance; 
		} else {
			return -1;
		}
	}
	public void setCustomerName(String name, int pin) {
		if (pin == this.pin && this.nameChangeCount < this.maxNameChangeCount) {
			this.customerName = name;
			this.nameChangeCount ++;
			System.out.println("You have changed your name: (" + this.nameChangeCount + 
			") times. Please Note that you can change your name a Maximum of: (" + this.maxNameChangeCount + ") times.");
		} else if (pin == this.pin && this.nameChangeCount >=this.maxNameChangeCount) {
			System.out.println("Name Change count greater than (" + this.maxNameChangeCount + "). Name can be changed a maximum of ("
			+ this.maxNameChangeCount + ") Times.");
		} else {
			System.out.println("pin invalid.");
		}
	}
	public String getCustomerName(int pin) {
		if (pin == this.pin) {
			return this.customerName;
		} else {
			return "Pin invalid";
		}
	}
	public void setCustomerEmail(int pin, String email) {
		if (pin == this.pin) {
			this.customerEmail = email;
			System.out.println("Email Updated Successfully.");
		} else {
			System.out.println("pin invalid. Email not updated.");
		}
	}
	public String getCustomerEmail(int pin) {
		if (pin == this.pin) {
			return this.customerEmail;
		} else {
			System.out.println("Pin is invalid");
			return "pin invalid";
		}
	}
	public void setPhoneNumber(int pin, String phoneNumber) {
		if (pin == this.pin) {
			this.customerPhoneNum = phoneNumber;
			System.out.println("Phone Number Updated.");
		} else {
			System.out.println("pin invalid");
		}
	}
	public String getPhoneNumber(int pin) {
		if (pin == this.pin) {
			return this.customerPhoneNum;
		} else {
			return "Invalid Pin";
		}
	}
	public void depositFunds(int pin, int accountNumber, double deposit) {
		if (pin == this.pin && accountNumber == this.accountNumber) {
			this.accountBalance = this.accountBalance + deposit;
			System.out.println("Your updated account balance is: " + this.accountBalance);
		} else if (pin == this.pin && this.accountNumber != accountNumber) {
			System.out.println("Incorrect account number.");
		} else {
			System.out.println("Incorrect Pin");
		}
	}
	public double withdrawFunds(int pin, int accountNumber, double amount) {
		if (pin == this.pin && accountNumber == this.accountNumber) {
			if ((this.accountBalance - amount) >= 0) {
				this.accountBalance = this.accountBalance - amount;
				System.out.println("Account balance Updated. Your balance is now: " + this.accountBalance);
				return amount;
			} 	else if (pin != this.pin){ 
				System.out.println("Pin is invalid.");
				}
		}
		System.out.println("Insufficient Funds.");
		return -1;
	}
}