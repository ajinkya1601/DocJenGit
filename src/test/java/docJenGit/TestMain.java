package docJenGit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestMain extends TestCase{

	public void testInputIsEven() {
		assertTrue(Main.checkIfInputIsAnEvenNumber(22));
	}
}
