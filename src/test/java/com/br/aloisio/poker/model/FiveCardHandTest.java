package com.br.aloisio.poker.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FiveCardHandTest {

  @Test
  void testGetHandStrengthFlushDiamonds() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("A", Suit.DIAMONDS);
    Card card2 = new Card("2", Suit.DIAMONDS);
    Card card3 = new Card("10", Suit.DIAMONDS);
    Card card4 = new Card("8", Suit.DIAMONDS);
    Card card5 = new Card("7", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FLUSH);
  }

  @Test
  void testGetHandStrengthFlushSpades() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("K", Suit.SPADES);
    Card card2 = new Card("t", Suit.SPADES);
    Card card3 = new Card("q", Suit.SPADES);
    Card card4 = new Card("j", Suit.SPADES);
    Card card5 = new Card("2", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FLUSH);
  }

  @Test
  void testGetHandStrengthFlushClubs() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("2", Suit.CLUBS);
    Card card2 = new Card("3", Suit.CLUBS);
    Card card3 = new Card("4", Suit.CLUBS);
    Card card4 = new Card("5", Suit.CLUBS);
    Card card5 = new Card("7", Suit.CLUBS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FLUSH);
  }

  @Test
  void testGetHandStrengthFlushHearts() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("8", Suit.HEARTS);
    Card card2 = new Card("3", Suit.HEARTS);
    Card card3 = new Card("4", Suit.HEARTS);
    Card card4 = new Card("5", Suit.HEARTS);
    Card card5 = new Card("7", Suit.HEARTS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FLUSH);
  }

  @Test
  void testGetHandStrengthStraightFlushHearts() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("6", Suit.HEARTS);
    Card card2 = new Card("3", Suit.HEARTS);
    Card card3 = new Card("4", Suit.HEARTS);
    Card card4 = new Card("5", Suit.HEARTS);
    Card card5 = new Card("7", Suit.HEARTS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.STRAIGHT_FLUSH);
  }

  @Test
  void testGetHandStrengthStraightFlushSpades() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("A", Suit.SPADES);
    Card card2 = new Card("2", Suit.SPADES);
    Card card3 = new Card("4", Suit.SPADES);
    Card card4 = new Card("5", Suit.SPADES);
    Card card5 = new Card("3", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.STRAIGHT_FLUSH);
  }

  @Test
  void testGetHandStrengthStraightFlushClubs() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("6", Suit.CLUBS);
    Card card2 = new Card("2", Suit.CLUBS);
    Card card3 = new Card("4", Suit.CLUBS);
    Card card4 = new Card("5", Suit.CLUBS);
    Card card5 = new Card("3", Suit.CLUBS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.STRAIGHT_FLUSH);
  }

  @Test
  void testGetHandStrengthStraightFlushDiamonds() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("6", Suit.DIAMONDS);
    Card card2 = new Card("7", Suit.DIAMONDS);
    Card card3 = new Card("4", Suit.DIAMONDS);
    Card card4 = new Card("5", Suit.DIAMONDS);
    Card card5 = new Card("3", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.STRAIGHT_FLUSH);
  }

  @Test
  void testGetHandStrengthQuadSixes() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("6", Suit.DIAMONDS);
    Card card2 = new Card("6", Suit.SPADES);
    Card card3 = new Card("6", Suit.CLUBS);
    Card card4 = new Card("6", Suit.HEARTS);
    Card card5 = new Card("3", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.QUADS);
  }

  @Test
  void testGetHandStrengthQuadTens() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("T", Suit.DIAMONDS);
    Card card2 = new Card("t", Suit.SPADES);
    Card card3 = new Card("10", Suit.CLUBS);
    Card card4 = new Card("T", Suit.HEARTS);
    Card card5 = new Card("A", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.QUADS);
  }

  @Test
  void testGetHandStrengthTensOverAces() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("T", Suit.DIAMONDS);
    Card card2 = new Card("t", Suit.SPADES);
    Card card3 = new Card("a", Suit.CLUBS);
    Card card4 = new Card("T", Suit.HEARTS);
    Card card5 = new Card("A", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FULL_HOUSE);
  }

  @Test
  void testGetHandStrengthDucesOverFives() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("2", Suit.DIAMONDS);
    Card card2 = new Card("2", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("5", Suit.HEARTS);
    Card card5 = new Card("5", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.FULL_HOUSE);
  }

  @Test
  void testGetHandStrengthTripSevens() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("2", Suit.DIAMONDS);
    Card card2 = new Card("A", Suit.SPADES);
    Card card3 = new Card("7", Suit.CLUBS);
    Card card4 = new Card("7", Suit.HEARTS);
    Card card5 = new Card("7", Suit.DIAMONDS);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.TRIPS);
  }

  @Test
  void testGetHandStrengthTripKings() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("k", Suit.DIAMONDS);
    Card card2 = new Card("A", Suit.SPADES);
    Card card3 = new Card("K", Suit.CLUBS);
    Card card4 = new Card("7", Suit.HEARTS);
    Card card5 = new Card("k", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.TRIPS);
  }

  @Test
  void testGetHandStrengthTwoPairAcesAndDuces() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("a", Suit.DIAMONDS);
    Card card2 = new Card("A", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("2", Suit.HEARTS);
    Card card5 = new Card("k", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.TWO_PAIR);
  }

  @Test
  void testGetHandStrengthTwoPairQueensAndJacks() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("J", Suit.DIAMONDS);
    Card card2 = new Card("Q", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("q", Suit.HEARTS);
    Card card5 = new Card("J", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.TWO_PAIR);
  }

  @Test
  void testGetHandStrengthPairAces() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("A", Suit.DIAMONDS);
    Card card2 = new Card("a", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("q", Suit.HEARTS);
    Card card5 = new Card("J", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.PAIR);
  }

  @Test
  void testGetHandStrengthPairNines() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("A", Suit.DIAMONDS);
    Card card2 = new Card("J", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("9", Suit.HEARTS);
    Card card5 = new Card("9", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.PAIR);
  }

  @Test
  void testGetHandStrengthHighCardJack() {
    List<Card> listCards = new ArrayList<>();
    Card card1 = new Card("7", Suit.DIAMONDS);
    Card card2 = new Card("J", Suit.SPADES);
    Card card3 = new Card("2", Suit.CLUBS);
    Card card4 = new Card("9", Suit.HEARTS);
    Card card5 = new Card("8", Suit.SPADES);
    listCards.add(card1);
    listCards.add(card2);
    listCards.add(card3);
    listCards.add(card4);
    listCards.add(card5);
    FiveCardHand fiveCardHand = new FiveCardHand(listCards);
    assertTrue(fiveCardHand.getHandStrength() == HandStrength.HIGH_CARD);
  }

  @Test
  void testFlushVsFullHouse() {
    List<Card> listCardsFlush = new ArrayList<>();
    Card card1Flush = new Card("7", Suit.DIAMONDS);
    Card card2Flush = new Card("J", Suit.DIAMONDS);
    Card card3Flush = new Card("2", Suit.DIAMONDS);
    Card card4Flush = new Card("9", Suit.DIAMONDS);
    Card card5Flush = new Card("8", Suit.DIAMONDS);
    listCardsFlush.add(card1Flush);
    listCardsFlush.add(card2Flush);
    listCardsFlush.add(card3Flush);
    listCardsFlush.add(card4Flush);
    listCardsFlush.add(card5Flush);
    FiveCardHand flush = new FiveCardHand(listCardsFlush);

    List<Card> listCardsFullHouse = new ArrayList<>();
    Card card1FullHouse = new Card("7", Suit.DIAMONDS);
    Card card2FullHouse = new Card("7", Suit.SPADES);
    Card card3FullHouse = new Card("7", Suit.CLUBS);
    Card card4FullHouse = new Card("9", Suit.HEARTS);
    Card card5FullHouse = new Card("9", Suit.SPADES);
    listCardsFullHouse.add(card1FullHouse);
    listCardsFullHouse.add(card2FullHouse);
    listCardsFullHouse.add(card3FullHouse);
    listCardsFullHouse.add(card4FullHouse);
    listCardsFullHouse.add(card5FullHouse);
    FiveCardHand fullHouse = new FiveCardHand(listCardsFullHouse);

    assertTrue(fullHouse.compareTo(flush) > 0);
  }


  @Test
  void testFlushVsTrips() {
    List<Card> listCardsFlush = new ArrayList<>();
    Card card1Flush = new Card("7", Suit.DIAMONDS);
    Card card2Flush = new Card("J", Suit.DIAMONDS);
    Card card3Flush = new Card("2", Suit.DIAMONDS);
    Card card4Flush = new Card("9", Suit.DIAMONDS);
    Card card5Flush = new Card("8", Suit.DIAMONDS);
    listCardsFlush.add(card1Flush);
    listCardsFlush.add(card2Flush);
    listCardsFlush.add(card3Flush);
    listCardsFlush.add(card4Flush);
    listCardsFlush.add(card5Flush);
    FiveCardHand flush = new FiveCardHand(listCardsFlush);

    List<Card> listCardsTrips = new ArrayList<>();
    Card card1Trips = new Card("7", Suit.DIAMONDS);
    Card card2Trips = new Card("7", Suit.SPADES);
    Card card3Trips = new Card("7", Suit.CLUBS);
    Card card4Trips = new Card("2", Suit.HEARTS);
    Card card5Trips = new Card("9", Suit.SPADES);
    listCardsTrips.add(card1Trips);
    listCardsTrips.add(card2Trips);
    listCardsTrips.add(card3Trips);
    listCardsTrips.add(card4Trips);
    listCardsTrips.add(card5Trips);
    FiveCardHand trips = new FiveCardHand(listCardsTrips);

    assertTrue(trips.compareTo(flush) < 0);
  }

  @Test
  void testQuadsVsTwoPair() {
    List<Card> listCardsQuads = new ArrayList<>();
    Card card1Quads = new Card("7", Suit.HEARTS);
    Card card2Quads = new Card("7", Suit.CLUBS);
    Card card3Quads = new Card("7", Suit.SPADES);
    Card card4Quads = new Card("7", Suit.DIAMONDS);
    Card card5Quads = new Card("8", Suit.DIAMONDS);
    listCardsQuads.add(card1Quads);
    listCardsQuads.add(card2Quads);
    listCardsQuads.add(card3Quads);
    listCardsQuads.add(card4Quads);
    listCardsQuads.add(card5Quads);
    FiveCardHand quads = new FiveCardHand(listCardsQuads);

    List<Card> listCardsTwoPairs = new ArrayList<>();
    Card card1TwoPairs = new Card("5", Suit.DIAMONDS);
    Card card2TwoPairs = new Card("5", Suit.SPADES);
    Card card3TwoPairs = new Card("6", Suit.CLUBS);
    Card card4TwoPairs = new Card("6", Suit.HEARTS);
    Card card5TwoPairs = new Card("9", Suit.SPADES);
    listCardsTwoPairs.add(card1TwoPairs);
    listCardsTwoPairs.add(card2TwoPairs);
    listCardsTwoPairs.add(card3TwoPairs);
    listCardsTwoPairs.add(card4TwoPairs);
    listCardsTwoPairs.add(card5TwoPairs);
    FiveCardHand twoPairs = new FiveCardHand(listCardsTwoPairs);

    assertTrue(quads.compareTo(twoPairs) > 0);
  }


  @Test
  void testCompareTwoEqualStraighFlushes() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.DIAMONDS);
    Card card3hand1 = new Card("q", Suit.DIAMONDS);
    Card card4hand1 = new Card("J", Suit.DIAMONDS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("Q", Suit.SPADES);
    Card card2hand2 = new Card("T", Suit.SPADES);
    Card card3hand2 = new Card("J", Suit.SPADES);
    Card card4hand2 = new Card("k", Suit.SPADES);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }

  @Test
  void testCompareTwoDifferentStraighFlushes() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.DIAMONDS);
    Card card3hand1 = new Card("q", Suit.DIAMONDS);
    Card card4hand1 = new Card("J", Suit.DIAMONDS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("Q", Suit.SPADES);
    Card card2hand2 = new Card("T", Suit.SPADES);
    Card card3hand2 = new Card("J", Suit.SPADES);
    Card card4hand2 = new Card("k", Suit.SPADES);
    Card card5hand2 = new Card("9", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoEqualFlushes() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.DIAMONDS);
    Card card3hand1 = new Card("q", Suit.DIAMONDS);
    Card card4hand1 = new Card("J", Suit.DIAMONDS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("Q", Suit.SPADES);
    Card card2hand2 = new Card("8", Suit.SPADES);
    Card card3hand2 = new Card("J", Suit.SPADES);
    Card card4hand2 = new Card("k", Suit.SPADES);
    Card card5hand2 = new Card("A", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }

  @Test
  void testCompareTwoDifferentFlushes() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("3", Suit.DIAMONDS);
    Card card3hand1 = new Card("q", Suit.DIAMONDS);
    Card card4hand1 = new Card("J", Suit.DIAMONDS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("Q", Suit.SPADES);
    Card card2hand2 = new Card("T", Suit.SPADES);
    Card card3hand2 = new Card("J", Suit.SPADES);
    Card card4hand2 = new Card("2", Suit.SPADES);
    Card card5hand2 = new Card("9", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentFlushesLowerCardHigher() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("k", Suit.DIAMONDS);
    Card card2hand1 = new Card("3", Suit.DIAMONDS);
    Card card3hand1 = new Card("q", Suit.DIAMONDS);
    Card card4hand1 = new Card("J", Suit.DIAMONDS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("Q", Suit.SPADES);
    Card card2hand2 = new Card("T", Suit.SPADES);
    Card card3hand2 = new Card("J", Suit.SPADES);
    Card card4hand2 = new Card("5", Suit.SPADES);
    Card card5hand2 = new Card("9", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoEqualQuads() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("A", Suit.SPADES);
    Card card3hand1 = new Card("a", Suit.CLUBS);
    Card card4hand1 = new Card("a", Suit.HEARTS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("a", Suit.SPADES);
    Card card2hand2 = new Card("A", Suit.DIAMONDS);
    Card card3hand2 = new Card("A", Suit.CLUBS);
    Card card4hand2 = new Card("A", Suit.HEARTS);
    Card card5hand2 = new Card("T", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }

  @Test
  void testCompareTwoDifferentQuads() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("A", Suit.SPADES);
    Card card3hand1 = new Card("a", Suit.CLUBS);
    Card card4hand1 = new Card("a", Suit.HEARTS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("9", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("9", Suit.CLUBS);
    Card card4hand2 = new Card("9", Suit.HEARTS);
    Card card5hand2 = new Card("T", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentQuadskicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("A", Suit.SPADES);
    Card card3hand1 = new Card("a", Suit.CLUBS);
    Card card4hand1 = new Card("a", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("A", Suit.SPADES);
    Card card2hand2 = new Card("A", Suit.DIAMONDS);
    Card card3hand2 = new Card("A", Suit.CLUBS);
    Card card4hand2 = new Card("A", Suit.HEARTS);
    Card card5hand2 = new Card("6", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentQuadsSamekicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("A", Suit.SPADES);
    Card card3hand1 = new Card("a", Suit.CLUBS);
    Card card4hand1 = new Card("a", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("5", Suit.SPADES);
    Card card2hand2 = new Card("5", Suit.DIAMONDS);
    Card card3hand2 = new Card("5", Suit.CLUBS);
    Card card4hand2 = new Card("5", Suit.HEARTS);
    Card card5hand2 = new Card("8", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoEqualStraight() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("6", Suit.DIAMONDS);
    Card card2hand1 = new Card("7", Suit.SPADES);
    Card card3hand1 = new Card("8", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("9", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("10", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("8", Suit.CLUBS);
    Card card4hand2 = new Card("7", Suit.HEARTS);
    Card card5hand2 = new Card("6", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }


  @Test
  void testCompareTwoDifferentStraight() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("j", Suit.DIAMONDS);
    Card card2hand1 = new Card("7", Suit.SPADES);
    Card card3hand1 = new Card("8", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("9", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("10", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("8", Suit.CLUBS);
    Card card4hand2 = new Card("7", Suit.HEARTS);
    Card card5hand2 = new Card("6", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentStraightWithWheel() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("j", Suit.DIAMONDS);
    Card card2hand1 = new Card("7", Suit.SPADES);
    Card card3hand1 = new Card("8", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("9", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("a", Suit.SPADES);
    Card card2hand2 = new Card("2", Suit.DIAMONDS);
    Card card3hand2 = new Card("3", Suit.CLUBS);
    Card card4hand2 = new Card("4", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }


  @Test
  void testCompareTwoDifferentStraightWithWheelAndBroadway() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.SPADES);
    Card card3hand1 = new Card("j", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("Q", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("a", Suit.SPADES);
    Card card2hand2 = new Card("2", Suit.DIAMONDS);
    Card card3hand2 = new Card("3", Suit.CLUBS);
    Card card4hand2 = new Card("4", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }


  @Test
  void testCompareTwoDifferentStraightWithBroadway() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.SPADES);
    Card card3hand1 = new Card("j", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("Q", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("6", Suit.SPADES);
    Card card2hand2 = new Card("2", Suit.DIAMONDS);
    Card card3hand2 = new Card("3", Suit.CLUBS);
    Card card4hand2 = new Card("4", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }


  @Test
  void testCompareTwoEqualFullHouse() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("10", Suit.SPADES);
    Card card2hand2 = new Card("t", Suit.DIAMONDS);
    Card card3hand2 = new Card("A", Suit.CLUBS);
    Card card4hand2 = new Card("a", Suit.HEARTS);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }

  @Test
  void testCompareTwoDifferentFullHouse() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("t", Suit.HEARTS);
    Card card5hand1 = new Card("10", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("10", Suit.SPADES);
    Card card2hand2 = new Card("t", Suit.DIAMONDS);
    Card card3hand2 = new Card("T", Suit.CLUBS);
    Card card4hand2 = new Card("a", Suit.HEARTS);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoEqualTrips() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("9", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("8", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("A", Suit.CLUBS);
    Card card4hand2 = new Card("a", Suit.HEARTS);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }

  @Test
  void testCompareTwoDifferentTrips() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("9", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("8", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("k", Suit.CLUBS);
    Card card4hand2 = new Card("K", Suit.HEARTS);
    Card card5hand2 = new Card("K", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentTripsOnFirstKicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("J", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("8", Suit.SPADES);
    Card card2hand2 = new Card("9", Suit.DIAMONDS);
    Card card3hand2 = new Card("a", Suit.CLUBS);
    Card card4hand2 = new Card("A", Suit.HEARTS);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoDifferentTripsOnSecondKicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("J", Suit.HEARTS);
    Card card5hand1 = new Card("5", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("2", Suit.SPADES);
    Card card2hand2 = new Card("J", Suit.DIAMONDS);
    Card card3hand2 = new Card("a", Suit.CLUBS);
    Card card4hand2 = new Card("A", Suit.HEARTS);
    Card card5hand2 = new Card("a", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }

  @Test
  void testCompareTwoEqualTwoPair() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("j", Suit.CLUBS);
    Card card4hand1 = new Card("J", Suit.HEARTS);
    Card card5hand1 = new Card("5", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("a", Suit.SPADES);
    Card card2hand2 = new Card("A", Suit.DIAMONDS);
    Card card3hand2 = new Card("j", Suit.CLUBS);
    Card card4hand2 = new Card("J", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  } 

  @Test
  void testCompareTwoDifferentTwoPairOnSecond() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("j", Suit.CLUBS);
    Card card4hand1 = new Card("J", Suit.HEARTS);
    Card card5hand1 = new Card("5", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("a", Suit.SPADES);
    Card card2hand2 = new Card("A", Suit.DIAMONDS);
    Card card3hand2 = new Card("9", Suit.CLUBS);
    Card card4hand2 = new Card("9", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }   

  @Test
  void testCompareTwoDifferentTwoPairOnFirst() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("A", Suit.DIAMONDS);
    Card card2hand1 = new Card("a", Suit.SPADES);
    Card card3hand1 = new Card("j", Suit.CLUBS);
    Card card4hand1 = new Card("J", Suit.HEARTS);
    Card card5hand1 = new Card("5", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("k", Suit.SPADES);
    Card card2hand2 = new Card("k", Suit.DIAMONDS);
    Card card3hand2 = new Card("q", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }   

  @Test
  void testCompareTwoDifferentTwoPairOnkicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("k", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.SPADES);
    Card card3hand1 = new Card("q", Suit.CLUBS);
    Card card4hand1 = new Card("q", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("k", Suit.SPADES);
    Card card2hand2 = new Card("k", Suit.DIAMONDS);
    Card card3hand2 = new Card("q", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }  


  @Test
  void testCompareTwoDifferentPairOnkicker() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("k", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.SPADES);
    Card card3hand1 = new Card("A", Suit.CLUBS);
    Card card4hand1 = new Card("q", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("k", Suit.SPADES);
    Card card2hand2 = new Card("k", Suit.DIAMONDS);
    Card card3hand2 = new Card("2", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  }   

  @Test
  void testCompareTwoEqualPair() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("k", Suit.DIAMONDS);
    Card card2hand1 = new Card("k", Suit.SPADES);
    Card card3hand1 = new Card("5", Suit.CLUBS);
    Card card4hand1 = new Card("q", Suit.HEARTS);
    Card card5hand1 = new Card("8", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("k", Suit.SPADES);
    Card card2hand2 = new Card("k", Suit.DIAMONDS);
    Card card3hand2 = new Card("8", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  }  

  @Test
  void testCompareTwoDifferentPairOnKickers() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("j", Suit.DIAMONDS);
    Card card2hand1 = new Card("j", Suit.SPADES);
    Card card3hand1 = new Card("K", Suit.CLUBS);
    Card card4hand1 = new Card("3", Suit.HEARTS);
    Card card5hand1 = new Card("4", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("6", Suit.SPADES);
    Card card2hand2 = new Card("j", Suit.DIAMONDS);
    Card card3hand2 = new Card("J", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  } 

  @Test
  void testCompareTwoDifferentPairOnPair() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("3", Suit.DIAMONDS);
    Card card2hand1 = new Card("3", Suit.SPADES);
    Card card3hand1 = new Card("K", Suit.CLUBS);
    Card card4hand1 = new Card("2", Suit.HEARTS);
    Card card5hand1 = new Card("4", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("6", Suit.SPADES);
    Card card2hand2 = new Card("2", Suit.DIAMONDS);
    Card card3hand2 = new Card("2", Suit.CLUBS);
    Card card4hand2 = new Card("Q", Suit.HEARTS);
    Card card5hand2 = new Card("5", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  } 


  @Test
  void testCompareTwoEqualHighCard() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("5", Suit.DIAMONDS);
    Card card2hand1 = new Card("6", Suit.SPADES);
    Card card3hand1 = new Card("9", Suit.CLUBS);
    Card card4hand1 = new Card("2", Suit.HEARTS);
    Card card5hand1 = new Card("4", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("9", Suit.SPADES);
    Card card2hand2 = new Card("6", Suit.DIAMONDS);
    Card card3hand2 = new Card("5", Suit.CLUBS);
    Card card4hand2 = new Card("4", Suit.HEARTS);
    Card card5hand2 = new Card("2", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) == 0);
  } 


  @Test
  void testCompareTwoDifferentHighCard() {
    List<Card> cardsHand1 = new ArrayList<>();
    Card card1hand1 = new Card("Q", Suit.DIAMONDS);
    Card card2hand1 = new Card("6", Suit.SPADES);
    Card card3hand1 = new Card("9", Suit.CLUBS);
    Card card4hand1 = new Card("2", Suit.HEARTS);
    Card card5hand1 = new Card("4", Suit.DIAMONDS);
    cardsHand1.add(card1hand1);
    cardsHand1.add(card2hand1);
    cardsHand1.add(card3hand1);
    cardsHand1.add(card4hand1);
    cardsHand1.add(card5hand1);
    FiveCardHand hand1 = new FiveCardHand(cardsHand1);

    List<Card> cardsHand2 = new ArrayList<>();
    Card card1hand2 = new Card("j", Suit.SPADES);
    Card card2hand2 = new Card("t", Suit.DIAMONDS);
    Card card3hand2 = new Card("8", Suit.CLUBS);
    Card card4hand2 = new Card("6", Suit.HEARTS);
    Card card5hand2 = new Card("7", Suit.SPADES);
    cardsHand2.add(card1hand2);
    cardsHand2.add(card2hand2);
    cardsHand2.add(card3hand2);
    cardsHand2.add(card4hand2);
    cardsHand2.add(card5hand2);
    FiveCardHand hand2 = new FiveCardHand(cardsHand2);

    assertTrue(hand1.compareTo(hand2) > 0);
  } 
}
