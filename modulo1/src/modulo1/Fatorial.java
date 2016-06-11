package modulo1;

public class Fatorial {

	public static void main(String[] args) {
		long fatorialValue = 1; 
		int numberToGetFatorial = 18 ;
		
		int i = numberToGetFatorial;
		
		while ( i != 1 ) {
			fatorialValue = fatorialValue  * i ;
			i--;
		}
		
		System.out.println("Fatorial de "+ numberToGetFatorial + " :"+ fatorialValue);
		

	}

}
