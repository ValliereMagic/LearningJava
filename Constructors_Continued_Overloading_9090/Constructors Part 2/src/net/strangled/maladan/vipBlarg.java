package net.strangled.maladan;

public class vipBlarg {
	private String name;
	private int creditLimit;
	private String emailAddress;
	
	
	public vipBlarg(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public vipBlarg() {
		this("default", 5000, "default");
	}
	public vipBlarg(String name, String emailAddress) {
		this(name, 5000, emailAddress);
	}
	public String getName() {
		return this.name;
	}
	public int getCreditLimit() {
		return this.creditLimit;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
}
