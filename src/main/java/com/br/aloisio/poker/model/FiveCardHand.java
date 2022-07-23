package com.br.aloisio.poker.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FiveCardHand implements Comparable<FiveCardHand>{

  private List<Card> hand;
  
  private HandStrength handStrength;
  private int lowerPairValue;
  private int higherPairValue;
  private int tripsValue;
  private int quadsValue;
  private boolean isWheel;


  public FiveCardHand(List<Card> hand) {
    validateHand(hand);
    Collections.sort(hand);
    
    this.hand = hand;

    this.handStrength = processHandStrength();

  }

  private void validateHand(List<Card> hand) {
    if(!(hand.size() == 5)){
      throw new RuntimeException("Invalid Hand, there is a unsupported number of cards - " + hand.size());
    }
    for (int i = 0; i < hand.size(); i++) {
      for (int j = i+1; j < hand.size(); j++) {
        if(hand.get(i).equals(hand.get(j))){
          throw new RuntimeException("Invalid Hand, there is a repeated card" + hand);
        }
      }      
    }
  }

  private HandStrength processHandStrength() {
    if(isFlush()){
      if(isStraight()){
        return HandStrength.STRAIGHT_FLUSH;
      }
      return HandStrength.FLUSH;
    }
    if(isStraight()){
      return HandStrength.STRAIGHT;
    }

    Stream<Card> stream = hand.stream();
    Map<Integer, List<Card>> map = stream.collect(Collectors.groupingBy(Card::getNumberValue));
    if(isQuads(map)){
      return HandStrength.QUADS;
    }

    if(isFullHouse(map)){
      return HandStrength.FULL_HOUSE;
    }

    if(isTrips(map)){
      return HandStrength.TRIPS;
    }

    if(isTwoPair(map)){
      return HandStrength.TWO_PAIR;
    }

    if(isPair(map)){
      return HandStrength.PAIR;
    }

    return HandStrength.HIGH_CARD;
  }

  private boolean isQuads(Map<Integer, List<Card>> map) {
    for (List<Card> cards : map.values()) {
      if(cards.size() == 4){
        quadsValue = cards.get(0).getNumberValue();
        return true;
      }
    }
    return false;
  }

  private boolean isTrips(Map<Integer, List<Card>> map) {
    for (List<Card> cards : map.values()) {
      if(cards.size() == 3){
        tripsValue = cards.get(0).getNumberValue();
        return true;
      }
    }
    return false;
  }

  private boolean isPair(Map<Integer, List<Card>> map) {
    for (List<Card> cards : map.values()) {
      if(cards.size() == 2){
        lowerPairValue = cards.get(0).getNumberValue();
        return true;
      }
    }
    return false;
  }

  private boolean isTwoPair(Map<Integer, List<Card>> map) {
    boolean firstPair = false;
    boolean secondPair = false;

    for (List<Card> cards : map.values()) {
      if(cards.size() == 2){
        if(firstPair == false){
          lowerPairValue = cards.get(0).getNumberValue();
          firstPair = true;
        } else {
          higherPairValue = cards.get(0).getNumberValue();
          secondPair = true;
        }
      }
    }
    return firstPair & secondPair;
  }

  private boolean isFullHouse(Map<Integer, List<Card>> map) {
    boolean trips = false;
    boolean pair = false;
    for (List<Card> cards : map.values()) {
      if(cards.size() == 3){
        tripsValue = cards.get(0).getNumberValue();
        trips = true;
      }
      if(cards.size() == 2){
        lowerPairValue = cards.get(0).getNumberValue();
        pair = true;
      }
    }
    return pair & trips;
  }

  private boolean isFlush() {
    Stream<Card> stream = hand.stream();
    Map<Suit, List<Card>> map = stream.collect(Collectors.groupingBy(Card::getSuit));
    
    return map.size() == 1;
  }

  private boolean isStraight() {
    int j = hand.get(0).getNumberValue(); 

    if (j == 2 && hand.get(hand.size() -1).getNumberValue() == 14){
      isWheel = isWheel();
      return isWheel(); // A is the higher card, and may count as 1 for straight purpouses.
    }

    for (int i = 0; i < hand.size(); i++, j++) {
      if (hand.get(i).getNumberValue() != j){
        return false;
      }
    }
    return true;
  }

  private boolean isWheel() {
    for (int i = 0; i < hand.size()-1; i++) {
      if (hand.get(i).getNumberValue() != i+2){
        return false;
      }
    }
    if (hand.get(hand.size()-1).getNumberValue() != 14){
      return false;
    }
    return true;
  }

  public HandStrength getHandStrength() {
    return handStrength;
  }

  @Override
  public String toString() {
    return "FiveCardHand = " + handStrength +  " -- " + hand;
  }

  @Override
  public int compareTo(FiveCardHand o) {
    if (handStrength.compareTo(o.handStrength) != 0){
      return handStrength.compareTo(o.handStrength);
    }
    
    if(handStrength == HandStrength.STRAIGHT_FLUSH || handStrength == HandStrength.FLUSH || handStrength == HandStrength.STRAIGHT || handStrength == HandStrength.HIGH_CARD){
      return compareEachCard(o);
    }

    if(handStrength == HandStrength.QUADS){
      if(quadsValue != o.quadsValue){
        return quadsValue - o.quadsValue;
      } 
      return compareEachCard(o);
    }

    if(handStrength == HandStrength.FULL_HOUSE){
      if(tripsValue != o.tripsValue){
        return tripsValue - o.tripsValue;
      } 
      return lowerPairValue - o.lowerPairValue;
    }

    if(handStrength == HandStrength.TRIPS){
      if(tripsValue != o.tripsValue){
        return tripsValue - o.tripsValue;
      } 
      return compareEachCard(o);
    }

    if(handStrength == HandStrength.TWO_PAIR){
      if(higherPairValue != o.higherPairValue){
        return higherPairValue - o.higherPairValue;
      } 
      if (lowerPairValue != o.lowerPairValue){
        return lowerPairValue - o.lowerPairValue;
      }
      return compareEachCard(o);
    }

    if(handStrength == HandStrength.PAIR){
      if(lowerPairValue != o.lowerPairValue){
        return lowerPairValue - o.lowerPairValue;
      } 
      return compareEachCard(o);
    }

    return 0;
  }

  private int compareEachCard(FiveCardHand o) {
    Collections.sort(this.hand);
    Collections.sort(o.hand);

    if(isWheel && o.isWheel) {
      return 0;
    } 
    if (isWheel) {
      return -1;
    }
    if (o.isWheel) {
      return 1;
    }

    for (int i = hand.size()-1; i >= 0 ; i--) {
      if(hand.get(i).getNumberValue() != o.hand.get(i).getNumberValue()){
        return hand.get(i).getNumberValue() - o.hand.get(i).getNumberValue();
      }
    }
    return 0;
  }

  

}
