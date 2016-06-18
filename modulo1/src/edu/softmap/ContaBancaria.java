package edu.softmap;

public class ContaBancaria {
	
	private String customerName;
	private int number;
	private double balance;
	private boolean special;
	private double limit = 1000;
	
	public ContaBancaria(String customerName, int number, boolean special) {
		this.customerName = customerName;
		this.number       = number;
		this.special      = special;
		this.balance      = 0;
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
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setSpecial(boolean value) {
		this.special = value;
	}
	

}
