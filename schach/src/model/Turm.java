package model;

public class Turm extends Spielfigur {

	public Turm(boolean istComputer, Position aktuellePosition) {
		super(istComputer, aktuellePosition);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bewegen(Position neuePosition) throws Exception {
		validiereBewegung(neuePosition);
	}
	
	protected void validiereBewegung(Position neuePosition) throws Exception {
		//sind wir noch im Spielfeld?
		if(neuePosition.x < 1 || neuePosition.x > 8 || neuePosition.y < 1 || neuePosition.y > 8) {
			throw new Exception("Ungültige Bewegung");			
		}
		//bewegt sich der Turm wirklich nur waagerecht oder senkrecht?
		if(neuePosition.x != getAktuellePosition().x || neuePosition.y != getAktuellePosition().y)  {
			throw new Exception("Bewegungsrichtung");
		}
	}

}
