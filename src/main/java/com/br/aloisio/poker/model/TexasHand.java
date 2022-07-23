package com.br.aloisio.poker.model;

public class TexasHand {
  
  private Card firstCard;
  private Card secondCard;

  public TexasHand(Card firstCard, Card secondCard) {
    validateHand(firstCard, secondCard);
    this.firstCard = firstCard;
    this.secondCard = secondCard;
  }

  private void validateHand(Card firstCard, Card secondCard) {
    if(firstCard.equals(secondCard)){
      throw new RuntimeException("Invalid hand, with 2 equal cards " + firstCard + " " + secondCard );
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((firstCard == null) ? 0 : firstCard.hashCode());
    result = prime * result + ((secondCard == null) ? 0 : secondCard.hashCode());
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
    TexasHand other = (TexasHand) obj;
    if (firstCard == null) {
      if (other.firstCard != null)
        return false;
    } else if (!firstCard.equals(other.firstCard))
      return false;
    if (secondCard == null) {
      if (other.secondCard != null)
        return false;
    } else if (!secondCard.equals(other.secondCard))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "" + firstCard + secondCard;
  }
  
}
