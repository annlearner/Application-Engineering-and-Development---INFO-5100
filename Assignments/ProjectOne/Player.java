package com.company;

public abstract class Player {

    Hand hand;

    public int bet(int bankroll, int minimum){return 0;};
    // REQUIRES: bankroll >= minimum
    // EFFECTS: returns the player's bet, between minimum and bankroll
    // inclusive

    public abstract boolean draw(Card dealer,             // Dealer's "up card"
                      Hand hand); // Player's current hand
    // EFFECTS: returns true if the player wishes to be dealt another
    // card, false otherwise. For dealer The dealer must
    // hit until he either reaches a total greater than or equal to 17
    // (hard or soft), or busts. For player

    public void expose(Card c){};
    // EFFECTS: allows the player to "see" the newly-exposed card c.
    // For example, each card that is dealt "face up" is expose()d.
    // Likewise, if the dealer must show his "hole card", it is also
    // expose()d.  Note: not all cards dealt are expose()d---if the
    // player goes over 21 or is dealt a natural 21, the dealer need
    // not expose his hole card.

    public void shuffled(){};
    // EFFECTS: tells the player that the deck has been re-shuffled.

};

// Dealer

// Player Simple;
// You need to derive a "simple player", as defined by the
// project specification

//Player Counting;
// You need to derive a "counting player", as defined by
// the project specification.This player counts cards in addition to playing the basic strategy.
// The intuition behind card counting is that when the deck has more face cards (worth 10)
// than low-numbered cards, the deck is favorable to the player. The converse is also true.
// The Counting player keeps a running “count” of the cards he’s seen from the deck.
// Each time he sees (via the expose() method) a 10, Jack, Queen, King, or Ace, he
// subtracts one from the count. Each time he sees a 2, 3, 4, 5, or 6, he adds
// one to the count. When he sees that the deck is shuffled(), the count is reset to zero.
// Whenever the count is +2 or greater and he has enough bankroll (larger than or equal
// to the double of the minimum), the Counting player bets double the minimum, otherwise
// he bets the minimum. The Counting player should not re-implement methods of the Simple player unnecessarily.



