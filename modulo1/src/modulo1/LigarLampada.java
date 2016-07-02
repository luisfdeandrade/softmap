package modulo1;

import edu.softmap.Lampada;

public class LigarLampada {

	public static void main(String[] args) {
		
		System.out.println("Inicia programa de ligar Lampada");
		Lampada lamp = new Lampada();
		System.out.println("Status 0: " + lamp.getStatusDescription() );
		lamp.turnOn();
		System.out.println("Status 1: " + lamp.getStatusDescription() );
		lamp.turnOff();
		System.out.println("Status Final: " + lamp.getStatusDescription() );
	

		
	}

}
