package modulo1;

import edu.softmap.ContaBancaria;
import edu.softmap.ClienteBanco;

public class TerminalBancario {

	public static void main(String[] args) {
		
		ClienteBanco  customer        = new ClienteBanco("NOME DO CLIENTE", 1);
		/*ContaBancaria customerAccount = new ContaBancaria(customer, false);		
		customerAccount.deposit(2000);
		customerAccount.withdrawal(1200);
		System.out.println("Saldo : "+ customerAccount.getBalance());
		customerAccount.withdrawal(1000);
		customerAccount.setSpecial(true);
		customerAccount.withdrawal(1000);
		System.out.println("Saldo Final do Cliente " + customerAccount.getCustomer().getCustomerName()  +" : "+ customerAccount.getBalance());
*/
	}

}
