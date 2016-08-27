package edu.softmap;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vetores {
  public static void main (String[] args ) {
	int a[] = {1,2,3,4};
	int b[] = new int[10];
	
	System.arraycopy(a, 0, b, 0 ,4);
	System.out.println(Arrays.toString(b));
  }
}
