package Test;
import Cards.Cards;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cards21 {

	@Test

 public void testCards() {
	 int result = Cards.cards(21, 21);
	 assertEquals(0, result);
 }
	@Test
public void testCards1() {
	int result = Cards.cards(15, 19);
	assertEquals(19, result);
	}
}
