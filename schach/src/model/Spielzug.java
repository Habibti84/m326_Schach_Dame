package model;

public abstract class Spielzug {
	
	private Spielfigur figur;

	public Spielfigur getFigur() {
		return figur;
	}
	
	public Spielzug(Spielfigur figur) {
		this.figur = figur;
	}
	
	public void ausfuehren() {
		
	}
	
	public void undo() {
		
	}
	

}
