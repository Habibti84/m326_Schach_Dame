package model;

public class Dame extends Spielfigur {	
	
	public Dame(boolean istComputer, Position aktuellePosition) {
		super(istComputer, aktuellePosition);
		
	}

	@Override
	public void bewegen(Position neuePosition) throws Exception {
		validiereBewegung(neuePosition);
		setAktuellePosition(neuePosition);
	}
	
	/**
	 * 
	 * @param neuePosition: erwartet eine x und y Position
	 * @throws Exception: Wenn die Bewegung nicht erlaubt ist
	 */
	public void validiereBewegung(Position neuePosition) throws Exception {
		//sind wir noch im Spielfeld?
		if(neuePosition.x < 1 || neuePosition.x > 8 || neuePosition.y < 1 || neuePosition.y > 8) {
			throw new Exception("Ausserhalb des Spielfelds");			
		}
		//bewegt sich die Dame nur waagerecht und senkrecht...
		if((neuePosition.x == getAktuellePosition().x || neuePosition.y == getAktuellePosition().y) || 
				//diagonale recht nach oben oder links nach unten
				(getAktuellePosition().x - neuePosition.x == getAktuellePosition().y - neuePosition.y) ||
				//diagonale links nach oben oder rechts nach unten
				(getAktuellePosition().x - neuePosition.x == (getAktuellePosition().y - neuePosition.y) * (-1))
				)  {
			System.out.println("Bewegung ok");			
		}
		else {
			throw new Exception("Bewegung ungültig");
		}		
	}
	
}
