package modulo1;


import edu.softmap.ClienteBanco;
import edu.softmap.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		
		ClienteBanco  customer        = new ClienteBanco("NOME DO CLIENTE", 1);
		ContaBancaria customerAccount = new ContaBancaria( customer, false);
		
		customerAccount.deposit(200);
		System.out.println("Saldo Inicial: "+ customerAccount.getBalance());
		customerAccount.withdrawal(1200);
		System.out.println("Saldo Final: "+ customerAccount.getBalance());
	}

}
