package com.br.aloisio.poker.model;

public class Flop {
  
  private Card firstCard;
  private Card secondCard;
  private Card thirdCard;

  public Flop(Card firstCard, Card secondCard, Card thirdCard) {
    validateFlop(firstCard, secondCard, thirdCard);
    this.firstCard = firstCard;
    this.secondCard = secondCard;
    this.thirdCard = thirdCard;
  }

  private void validateFlop(Card firstCard, Card secondCard, Card thirdCard) {
    if(firstCard.equals(secondCard) || firstCard.equals(thirdCard) || secondCard.equals(thirdCard)){
      throw new RuntimeException("Invalid flop, some cards are equal " + firstCard + " " + secondCard + " " + thirdCard);
    }
  }

  @Override
  public String toString() {
    return "Flop = " + firstCard + secondCard + thirdCard;
  }

  public Card getFirstCard() {
    return firstCard;
  }

  public Card getSecondCard() {
    return secondCard;
  }

  public Card getThirdCard() {
    return thirdCard;
  }  
  
  
}
