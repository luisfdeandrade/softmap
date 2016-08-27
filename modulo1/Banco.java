package modulo1;


import edu.softmap.ClienteBanco;
import edu.softmap.ContaBancaria;
import edu.softmap.ContaEspecial;
import edu.softmap.ContaSimples;

public class Banco {

	public static void main(String[] args) {
		
		ContaBancaria contas[] = null;
		contas = new ContaBancaria[2];
		
		ClienteBanco  customer        = new ClienteBanco("NOME DO CLIENTE PADRAO", 1);
		ContaSimples customerStandard = new ContaSimples( customer);
		
		ClienteBanco  customer2        = new ClienteBanco("NOME DO CLIENTE STARDAND", 1);
		ContaEspecial customerPremium = new ContaEspecial( customer2, 1000);
		
		contas[0] = customerStandard;
		contas[1] = customerPremium;
		
		for(int i = 0; i < contas.length; i++ ) {
			
		
			System.out.println(contas[i].getCustomer().getCustomerName());
			System.out.println("Saldo Inicial: "+ contas[i].getBalance());
			try {
				contas[i].deposit(-200);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				contas[i].withdrawal(1100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Saldo Final: "+ contas[i].getBalance());
		}
		
		
	}

}
