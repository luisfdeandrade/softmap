package modulo1;

import edu.softmap.MinhaData;

/*	
 * @author Softmap
 */
public class AloMundo {
	
	public static void main(String[] args) {
		System.out.println("Alo mundo!");
		MinhaData hoje;
		hoje = new MinhaData();
		hoje.dia = 11;
		hoje.mes = 6;
		hoje.ano = 2016;
		
		System.out.print("Hoje é dia "+ hoje.dia);
		System.out.print(" do mes "+ hoje.mes);
		System.out.print(" do ano de "+ hoje.ano);
		
		MinhaData nascimento;
		nascimento = new MinhaData();
		nascimento.dia = 01;
		nascimento.mes = 01;
		nascimento.ano = 1993;
		
		System.out.println("");
		System.out.print("Nasci em  "+ nascimento.dia);
		System.out.print(" do "+ nascimento.mes);
		System.out.print(" de "+ nascimento.ano);	

	}

}
	