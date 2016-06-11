package modulo1;

import edu.softmap.Ponto;

public class Exercicio2Ponto {
	public static void main(String[] args) {
		   
		  Ponto inicio,fim;
		  
		  inicio = new Ponto();
		  inicio.coordenateX = 10;
		  inicio.coordenateY = 10;
		  
		  fim = new Ponto();
		  fim.coordenateX  = 20;
		  fim.coordenateY  = 30;
		  
		  System.out.println("Localizacao inicio ("+ inicio.coordenateX+ ","+inicio.coordenateY + ")");
		  System.out.println("Localizao fim (" + fim.coordenateX + ","+ fim.coordenateY + ")");
		  
		  
	   }
}
