package modulo1;

public class NumeroPrimo {

	public static void main(String[] args) {
		int number = 3;
		
		boolean isPrimeNumber = true;
	
	    for( int i = number -1 ; i > 1;i--)  {
	    	
	    	if ( number % i == 0 ) {
	    		isPrimeNumber = false;
	    		break;
	    	}
	    }
	    
	    if (isPrimeNumber)
	    	System.out.println("É primo");
	    else
	    	System.out.println("Não é primo!");

	}

}
