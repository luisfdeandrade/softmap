package modulo1;


import edu.softmap.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		
		ContaBancaria customerAccount = new ContaBancaria( "Luis", 001, false);		
		customerAccount.deposit(200);
		System.out.println("Saldo Inicial: "+ customerAccount.getBalance());
		customerAccount.withdrawal(1200);
		System.out.println("Saldo Final: "+ customerAccount.getBalance());
	}

}
