package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import code.tHot;

public class TooHotTest {

	@Test
	public void test() {
		boolean resultOftooHot = tHot.tooHot(90, true);
		assertTrue(resultOftooHot);
		
	}

}
