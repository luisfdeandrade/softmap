package modulo1;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		
		String numberInputedFromUser;
		int number;
		
		numberInputedFromUser = JOptionPane.showInputDialog("Por favor, informe o n�mero");
		number = Integer.parseInt(numberInputedFromUser);
		
		if ( number % 2 == 0)
			System.out.println("O numero � par");
		else
			System.out.println("O numero � �mpar");

	}

}
