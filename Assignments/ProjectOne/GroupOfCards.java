package com.company;

import java.util.List;

public class GroupOfCards {
    private List<Card> cards;
    GroupOfCards(){};

    void addCard(Card c){};
    // EFFECTS: adds the card "c" to those presently held.

    void discardAll(){};
    // EFFECTS: discards any cards presently held , restoring the state
    // of the cards to empty.

    int getCurrentSize(){return 0;}
    // EFFECTS: return the length of cards;

    void display(){}
    //EFFECTS: display every card in cards;

    Card deleteCard(){return null;};
    // EFFECTS: delete the top card from the group of cards and return the
    // deleted card value;


}
