package junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Sallon;

public class MaisonTest {

	@Test
	public void testPieceNull() {

		Maison m = new Maison();
		int s = m.getPieces().size();
		m.ajouterPiece(null);
		assertEquals(s, m.getPieces().size());
	}

	@Test
	public void testEspacePieceNegative() {
		Maison m = new Maison();
		int s = m.getPieces().size();
		m.ajouterPiece(new Sallon(-5, 3));
		assertEquals(s, m.getPieces().size());
	}
}
