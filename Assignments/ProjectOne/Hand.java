package com.company;

public class Hand extends GroupOfCards{

    class HandValue {
        int  count;    // Value of hand
        boolean soft;     // true if hand value is a soft count
    };
    // OVERVIEW: A blackjack hand of zero or more cards

    private HandValue curValue;

    Hand(){};
    // EFFECTS: establishes an empty blackjack hand.


    HandValue getHandValue(){return null;};
    // EFFECTS: returns the present value of the blackjack hand.  The
    // count field is the highest blackjack total possible without
    // going over 21.  The soft field should be true if and only if at
    // least one ACE is present, and its value is counted as 11 rather
    // than 1.  If the hand is over 21, any value over 21 may be returned.
    //
    // Note: you are not allowed to change any member variables inside
    // handValue.  It is required because Players only get const Hands
    // passed to them, and therefore can only call methods like addCard,
    // to change the hand.

}
