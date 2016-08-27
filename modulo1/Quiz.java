package modulo1;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
	   String questions[];
	   String answers[];
	   
	   questions  = new String[5];
	   questions[0] = " É um pais da europa ";
	   questions[1] = " Eliminou o Brasil na copa de 2006";
	   questions[2] = " No passado invadiu o Brasil";	
	   questions[3] = " Famoso por seus moinhos e bicicletas";	
	   questions[4] = " Seu idioma é o holandês:";
	   	
	   answers  = new String[5];
	   for (int i = 0; i < questions.length; i++) {
	     String answerReturnedByUser = JOptionPane.showInputDialog(questions[i]);
	     answers[i] = answerReturnedByUser;
	   }
	   
	   for (int i = 0; i < answers.length; i++) {
		   JOptionPane.showMessageDialog(null, questions[i] + " :" + answers[i]);
	   }

	}

}
