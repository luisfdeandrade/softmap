package edu.softmap;

public class ContaEspecial extends ContaBancaria {
	
	private double limit;
	
	public ContaEspecial(ClienteBanco customer, double limit) {
		super(customer);
		this.limit = limit;
	}
	
	@Override
	public void withdrawal(double value ) {
		if ( temsaldo(value))
			this.balance=- value;
			
	}

	private boolean temsaldo(double value) {
		return value <= super.getBalance() + this.limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() + this.limit;
	}
	

}
