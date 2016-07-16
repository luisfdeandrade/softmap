package edu.softmap;

public class ContaBancaria {
	
	private ClienteBanco customer;
	protected double balance;
	
	public ContaBancaria(ClienteBanco customer) {
		this.customer     = customer; 
		this.balance      = 0;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public ClienteBanco getCustomer() {
		return this.customer;
	}
	
	public void withdrawal(double value ) {
		if ( temsaldo(value)) 
			 this.balance-= value;
	}

	private boolean temsaldo(double value) {
		return value <= this.balance;
	}
	
	
	public void deposit( double valueOfDeposit ) {
		if (valueOfDeposit <= 0)
			return;
		
		this.balance+= valueOfDeposit;
	}
	

	
	

}
