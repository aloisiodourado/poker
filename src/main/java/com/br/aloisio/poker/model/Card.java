package com.br.aloisio.poker.model;

public class Card implements Comparable<Card> {
  private int numberValue; // J is 11, Q is 12, K is 13 and A is 14
  private String faceValue;
  private Suit suit;

  public int getNumberValue() {
    return numberValue;
  }

  public String getFaceValue() {
    return faceValue;
  }

  public Suit getSuit() {
    return suit;
  }

  public Card(String faceValue, Suit suit){
    this.numberValue = getNumberValue(faceValue);
    this.faceValue = faceValue;
    this.suit = suit;

  }

  private int getNumberValue(String faceValue){
    switch (faceValue) {
      case "2":
        return 2;
      case "3":
        return 3;
      case "4":
        return 4;
      case "5":
        return 5;
      case "6":
        return 6;
      case "7":
        return 7;
      case "8":
        return 8;
      case "9":
        return 9;
      case "10":
      case "T":
      case "t":
        return 10;
      case "J":
      case "j":
        return 11;
      case "Q":
      case "q":
        return 12;    
      case "K":
      case "k":
        return 13;
      case "A":
      case "a":
        return 14;    
      default:
        throw new RuntimeException("Invalid face Value received " + faceValue);
    }
  }

  @Override
  public String toString() {
    return faceValue + suit;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + numberValue;
    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    if (numberValue != other.numberValue)
      return false;
    if (suit != other.suit)
      return false;
    return true;
  }

  @Override
  public int compareTo(Card o) {
    return Integer.compare(numberValue, o.numberValue) != 0 ? Integer.compare(numberValue, o.numberValue) : suit.compareTo(o.suit);
  }

  
}
