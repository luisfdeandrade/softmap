package modulo1;

import edu.softmap.ContaBancaria;

public class TerminalBancario {

	public static void main(String[] args) {
		ContaBancaria customerAccount = new ContaBancaria( "Luis", 001, false);		
		customerAccount.deposit(2000);
		customerAccount.withdrawal(1200);
		System.out.println("Saldo : "+ customerAccount.getBalance());
		customerAccount.withdrawal(1000);
		customerAccount.setSpecial(true);
		customerAccount.withdrawal(1000);
		System.out.println("Saldo: "+ customerAccount.getBalance());

	}

}
