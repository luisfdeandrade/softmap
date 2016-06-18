package edu.softmap;

public class ClienteBanco {
	
	private String customerName;
	private int number;
	
	public ClienteBanco(String customerName, int number) {
		this.customerName = customerName;
		this.number       = number;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
}
