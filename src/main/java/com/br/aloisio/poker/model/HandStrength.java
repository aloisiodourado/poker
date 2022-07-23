package com.br.aloisio.poker.model;

public enum HandStrength {
  HIGH_CARD(0),
  PAIR(1),
  TWO_PAIR(2),
  TRIPS(3),
  STRAIGHT(4),
  FLUSH(5),
  FULL_HOUSE(6),
  QUADS(7),
  STRAIGHT_FLUSH(8);

  public final int strength;

  private HandStrength(int strength) {
    this.strength = strength;
  }
  
}
