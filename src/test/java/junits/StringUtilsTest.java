package junits;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.StringUtils;

public class StringUtilsTest {

	@Test
	public void testEval() {
		int res = StringUtils.levenshteinDistance("Chien", "Chine");
		assertEquals(2, res);
	}

	@Test
	public void testEvalAvecEspaces() {
		int res = StringUtils.levenshteinDistance("Chien  ", "Chine");
		assertEquals(2, res);
	}

	@Test
	public void testEvalAvecNull() {
		int res = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, res);
	}
	
	@Test
	public void testTrim() {
		CharSequence c = StringUtils.trim("   test  ");
		assertEquals("test", c);
	}
}
