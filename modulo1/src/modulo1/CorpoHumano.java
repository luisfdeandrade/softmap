package modulo1;

import edu.softmap.Cabeca;
import edu.softmap.Cerebro;
import edu.softmap.Corpo;
import edu.softmap.MembroSuperior;
import edu.softmap.Tronco;


public class CorpoHumano {

	public static void main(String[] args) {
		
		Corpo frank = new Corpo();
		frank.setCabeca(new Cabeca());
		frank.getCabeca().setCerebro(new Cerebro());
		frank.setTronco(new Tronco());
		frank.getTronco().setBracoDireito(new MembroSuperior());
	}

}
