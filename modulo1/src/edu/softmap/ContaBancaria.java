package edu.softmap;

public class ContaBancaria {
	
	private ClienteBanco customer;
	private double balance;
	private boolean special;
	private double limit = 1000;
	
	public ContaBancaria(ClienteBanco customer, boolean special) {
		this.customer     = customer; 
		this.special      = special;
		this.balance      = 0;
	}
	
	public void setSpecial(boolean value) {
		this.special = value;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public ClienteBanco getCustomer() {
		return this.customer;
	}
	
	public void withdrawal(double value ) {
		if ( value <= this.balance) 
			 this.balance-= value;
		else if( this.special == true &&( value <= this.balance + this.limit ) )
			this.balance-= value;	
	}
	
	
	public void deposit( double valueOfDeposit ) {
		if (valueOfDeposit <= 0)
			return;
		
		this.balance+= valueOfDeposit;
	}
	

	
	

}
