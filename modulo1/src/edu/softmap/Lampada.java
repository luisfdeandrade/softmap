package edu.softmap;

public class Lampada {
	
	private boolean status;
		
	public void turnOn() {
		this.status = true;
	}

	public void turnOff() {
		this.status = false;
	}
	
	public boolean getStatus() {
		return this.status;
	}
}
