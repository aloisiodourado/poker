package com.br.aloisio.poker.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CardTest {


  @Test
  void testConstructor() {
    assertThrows(RuntimeException.class, () -> new Card("h", Suit.DIAMONDS));
    Card kingHearts = new Card("k", Suit.HEARTS);
    assertNotNull(kingHearts);
  }

  @Test
  void testEquals() {
    Card kingHeartsLowCase = new Card("k", Suit.HEARTS);
    Card kingHeartsUpperCase = new Card("K", Suit.HEARTS);

    assertTrue(kingHeartsLowCase.equals(kingHeartsUpperCase));

    Card queenHeartsUpperCase = new Card("Q", Suit.HEARTS);
    assertTrue(!kingHeartsLowCase.equals(queenHeartsUpperCase));

    Card tenSpadesNumber = new Card("10", Suit.SPADES);
    Card tenSpadesLowCase = new Card("t", Suit.SPADES);
    Card tenSpadesUpperCase = new Card("T", Suit.SPADES);
    Card tenClubsUpperCase = new Card("T", Suit.CLUBS);
    Card tenDiamondsUpperCase = new Card("T", Suit.DIAMONDS);

    assertTrue(tenSpadesNumber.equals(tenSpadesLowCase));
    assertTrue(tenSpadesNumber.equals(tenSpadesUpperCase));
    assertTrue(!tenSpadesNumber.equals(tenClubsUpperCase));
    assertTrue(!tenSpadesNumber.equals(tenDiamondsUpperCase));
    assertTrue(tenSpadesLowCase.equals(tenSpadesUpperCase));
    assertTrue(!tenClubsUpperCase.equals(tenDiamondsUpperCase));


  }

}
