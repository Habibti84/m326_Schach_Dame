package model;

public class Bewege extends Spielzug {
	
	private Position neuePosition;
	
	public Bewege(Spielfigur figur, Position neuePosition)  {
		super(figur);
		this.neuePosition = neuePosition;
	}
	
	public void ausfuehren() {
		
	}
	
	@Override
	public void undo() {
		
	}
	
	

}
