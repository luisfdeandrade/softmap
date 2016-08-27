package auto.eletrico;

public class Lampada {
	
	private boolean status;
	
	public Lampada( ) {
		this.status = true;
	}
		
	public void turnOn() {
		this.status = true;
	}

	public void turnOff() {
		this.status = false;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public String getStatusDescription() {
		return (this.getStatus()) ? "Ligado" : "Desligado";
	}
}
