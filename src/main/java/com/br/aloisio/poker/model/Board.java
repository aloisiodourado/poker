package com.br.aloisio.poker.model;

public class Board {

  private Flop flop;
  private Card turn;
  private Card river;
  
  public Board() {
  }
 
  public Board(Flop flop) {
    this.flop = flop;
    validateBoard();
  }
    
  public Board(Flop flop, Card turn) {
    this.flop = flop;
    this.turn = turn;
    validateBoard();
  }

  public Board(Flop flop, Card turn, Card river) {
    this.flop = flop;
    this.turn = turn;
    this.river = river;
    validateBoard();
  }

  private void validateBoard() {
    if (turn != null){
      validateTurn();
    }
    if (river != null){
      validateRiver();
    }
  }

  private void validateTurn(){
    if (flop == null){
      throw new RuntimeException("Invalid Board, there is a turn without a Flop ");
    }
    if (turn.equals(flop.getFirstCard()) || turn.equals(flop.getSecondCard()) || turn.equals(flop.getThirdCard())){
      throw new RuntimeException("Invalid Board, there is a repeated card " + flop + turn);
    }
  }

  private void validateRiver(){
    if (turn == null){
      throw new RuntimeException("Invalid Board, there is a river without a turn ");
    }

    if (river.equals(turn) || river.equals(flop.getFirstCard()) || river.equals(flop.getSecondCard()) || river.equals(flop.getThirdCard())){
      throw new RuntimeException("Invalid Board, there is a repeated card " + flop + turn + river);
    }
  }

  public void setFlop(Flop flop) {
    if (this.flop != null){
      throw new RuntimeException("Not allowed to change the flop");
    }
    if (flop == null){
      throw new RuntimeException("Not allowed to set a null flop");
    }
    this.flop = flop;
    validateBoard();
  }

  public void setTurn(Card turn) {
    if (this.turn != null){
      throw new RuntimeException("Not allowed to change the turn");
    }
    if (turn == null){
      throw new RuntimeException("Not allowed to set a null turn");
    }

    this.turn = turn;
    validateBoard();
  }

  public void setRiver(Card river) {
    if (this.river != null){
      throw new RuntimeException("Not allowed to change the river");
    }
    if (river == null){
      throw new RuntimeException("Not allowed to set a null river");
    }
    this.river = river;
    validateBoard();
  }

  public Flop getFlop() {
    return flop;
  }

  public Card getTurn() {
    return turn;
  }

  public Card getRiver() {
    return river;
  }

  @Override
  public String toString() {
    return "Board = " + flop.getFirstCard() + flop.getSecondCard() + flop.getThirdCard() + turn + river;
  }

}
