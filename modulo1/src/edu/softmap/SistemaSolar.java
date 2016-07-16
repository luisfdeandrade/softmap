package edu.softmap;

public class SistemaSolar {
	
	private Planeta planetas[];
	
	class Planeta {
		private String nome;
		private double distanciaDoSol;		
		
		public Planeta(String nome, double distanciaDoSol) {
			this.nome = nome;
			this.distanciaDoSol = distanciaDoSol;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public double getDistancia() {
			return this.distanciaDoSol;
		}
	}
	
	public SistemaSolar() {	
		this.planetas    = new Planeta[3];
		this.planetas[0] = new Planeta("Terra", 14960000);
		this.planetas[1] = new Planeta("Marte", 22790000);
		this.planetas[2] = new Planeta("Júpiter", 77850000);
	
	}
	
	public static void main(String[] args) {
		
		SistemaSolar viaLactea = new SistemaSolar();
		viaLactea.mostrePlanetas();
		
	}
	
	public void mostrePlanetas() {
		
		for (Planeta planeta : this.planetas) {
			System.out.println(planeta.getNome() + " distancia aproximada do sol é de  " + planeta.getDistancia() + " km");
		}
		
	}
	

	

}
