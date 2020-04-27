package jUnit;
import model.Dame;
import model.Position;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDame {
	
	Dame d = null;

	@Before
	public void setUp() throws Exception {
		d = new Dame(false, new Position(2, 2));
	}
	
	@Test
	public void ausserhalbSpielfeld() {
		try {			
			d.validiereBewegung(new Position(9, 1));			
			fail("Ausserhalb des Spielfelds wird nicht erkannt");
		} catch (Exception e) {			
			e.printStackTrace();
			assertTrue(true);
		}
	}

	@Test
	public void testSenkrechtNachObenPositiv() {
		try {
			d.validiereBewegung(new Position(2,8));
			assertTrue("testSenkrechtRunterPositiv bestanden", true);
			//System.out.println("testSenkrechtRunterPositiv bestanden");
		} catch (Exception e) {
			e.printStackTrace();
			fail("Diese Bewegung ist gültig");
		}		
	}
	
	@Test
	public void testSenkrechtRunterPositiv() {
		try {
			d.validiereBewegung(new Position(2,1));
			assertTrue("testSenkrechtRunterPositiv bestanden", true);
			//System.out.println("testSenkrechtRunterPositiv bestanden");
		} catch (Exception e) {
			e.printStackTrace();
			fail("Diese Bewegung ist gültig");
		}		
	}
	
	@Test
	public void testWaagrechtRechtsPositiv() {
		try {
			d.validiereBewegung(new Position(3, 2));
			assertTrue(true);
			//System.out.println("testWaagrechtRechtsPositiv bestanden");
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testWaagrechtRechtsPositiv nicht bestanden");
		}
	}
	
	@Test
	public void testWaagrechtLinksPositiv() {
		try {
			d.validiereBewegung(new Position(1, 2));
			assertTrue(true);
			//System.out.println("testWaagrechtRechtsPositiv bestanden");
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testWaagrechtRechtsPositiv nicht bestanden");
		}
	}
	
	@Test
	public void testDiagonalRechtsNachObenPositiv() {
		try {
			d.validiereBewegung(new Position(5, 5));
			assertTrue(true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testDiagonalRechtsNachOben nicht bestanden");
		}
	}
	
	@Test
	public void testDiagonalRechtsNachUntenPositiv() {
		try {
			d.validiereBewegung(new Position(3, 1));
			assertTrue(true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testDiagonalRechtsNachUnten nicht bestanden");
		}
	}
	
	@Test
	public void testDiagonalLinksNachObenPositiv() {
		try {
			d.validiereBewegung(new Position(3, 1));
			assertTrue(true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testDiagonalLinksNachOben nicht bestanden");
		}
	}
	
	@Test
	public void testDiagonalLinksNachUntenPositiv() {
		try {
			d.validiereBewegung(new Position(1, 1));
			assertTrue(true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail("testDiagonalLinksNachUnten nicht bestanden");
		}
	}
	
	@Test
	public void testDiagonalRechtsNachObenNegativ() {
		try {
			d.validiereBewegung(new Position(4,3));
			fail("Falsche Diagonale wird nicht erkannt");
		} catch(Exception e) {
			e.printStackTrace();
			assertTrue(true);
		}		
	}

}
