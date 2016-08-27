package modulo1;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
	
		String valueOfMInputedFromUser,valueOfNInputedFromUser ;
		int numberM, numberN;
		

		valueOfMInputedFromUser = JOptionPane.showInputDialog("Por favor, informe o valor de M");
		numberM = Integer.parseInt(valueOfMInputedFromUser);
		
		valueOfNInputedFromUser = JOptionPane.showInputDialog("Por favor, informe o valor de N");
		numberN = Integer.parseInt(valueOfNInputedFromUser);
		
		System.out.println("Respostas:");
	

		for(int i =0; i < numberN; i++ ) {
			
		   if ( i*numberM  >= numberN )
				break;
			
			System.out.print(i * numberM +" ");
		}
		

	}

}
