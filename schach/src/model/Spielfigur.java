package model;

public class Spielfigur {
	
	boolean istComputer;
	Position aktuellePosition;
	
	public Spielfigur(boolean istComputer, Position aktuellePosition) {
		this.istComputer = istComputer;
		this.aktuellePosition = aktuellePosition;
	}
	
	public void bewegen(Position neuePosition) throws Exception {
		
	}

	public boolean isIstComputer() {
		return istComputer;
	}

	public void setIstComputer(boolean istComputer) {
		this.istComputer = istComputer;
	}

	public Position getAktuellePosition() {
		return aktuellePosition;
	}

	public void setAktuellePosition(Position aktuellePosition) {
		this.aktuellePosition = aktuellePosition;
	}

}
