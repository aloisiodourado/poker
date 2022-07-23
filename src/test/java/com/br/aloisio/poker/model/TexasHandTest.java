package com.br.aloisio.poker.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TexasHandTest {

  @Test
  void testConstructor() {
    Card aceClubs = new Card("A", Suit.CLUBS);
    Card aceHearts = new Card("A", Suit.HEARTS);
    TexasHand aceClubsAceHearts = new TexasHand(aceClubs, aceHearts);

    assertNotNull(aceClubsAceHearts);

    assertThrows(RuntimeException.class, ()-> new TexasHand(aceClubs, aceClubs));
  }

  @Test
  void testEquals() {
    Card aceClubs = new Card("A", Suit.CLUBS);
    Card aceHearts = new Card("A", Suit.HEARTS);
    Card aceDiamonds = new Card("A", Suit.DIAMONDS);
    Card aceSpades = new Card("A", Suit.SPADES);
    TexasHand aceClubsAceHearts = new TexasHand(aceClubs, aceHearts);
    TexasHand aceDiamonsAceSpades = new TexasHand(aceDiamonds, aceSpades);


    assertTrue(!aceClubsAceHearts.equals(aceDiamonsAceSpades));
    assertTrue(aceClubsAceHearts.equals(aceClubsAceHearts));

  }
}
