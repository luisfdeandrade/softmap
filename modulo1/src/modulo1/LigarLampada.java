package modulo1;

import edu.softmap.Lampada;

public class LigarLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		lamp.turnOn();
		lamp.turnOff();
	
		String status;
		status = (lamp.getStatus()) ? "Ligado" : "Desligado";
		
		System.out.println("Estado da Lampada: " + status);
	}

}
