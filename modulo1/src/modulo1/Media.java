package modulo1;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		int grades[];
		grades = new int[5];
		
		String gradeReturnedByUser;
		int grade, sumOfAllGrades = 0;
		
		for(int i = 0; i < grades.length; i++ ) {
			
			gradeReturnedByUser = JOptionPane.showInputDialog("Informe a nota numero " + (i+1) );
			grade = Integer.parseInt(gradeReturnedByUser);
			grades[i] = grade;
			sumOfAllGrades+= grade;
		}
		
		JOptionPane.showMessageDialog(null, " Media:" + sumOfAllGrades/grades.length);
			
		
	

	}

}
