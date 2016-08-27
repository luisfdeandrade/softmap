package edu.softmap;

import erros.DepositoInvalidoException;
import erros.EstouroSaqueException;

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
	
	public void withdrawal(double value ) throws EstouroSaqueException  {
		if ( temsaldo(value)) 
			 this.balance-= value;
		else
			throw new EstouroSaqueException("O valor do saque � maior do que o valor dispon�vel em conta");
	}

	private boolean temsaldo(double value) {
		return value <= this.balance;
	}
	
	
	public void deposit( double valueOfDeposit ) throws DepositoInvalidoException {
		
	
		if (valueOfDeposit <= 0)
			throw new DepositoInvalidoException("O valor � inv�lido para dep�sito");
		
		this.balance+= valueOfDeposit;
	}
	

	
	

}
