package com.company;

public class Trick {

    Player player;
    Dealer dealer;
    int bet;

    Trick(String type, int bankroll, int minimum){};

    void play(){

    }
    // execute the five following steps;

    void wager(){
    };

    void DealFour(){};
    //After the wager, the dealer deals a total of four cards:
    // the first face-up to the player, the second face-up to
    // himself, the third face-up to the player, and the fourth
    // face-down to himself.

    void playerTurn(){};

    void dealerTurn(){};

    // dealer's turn only happens if the player hasn’t busted or the player is
    // not dealt a natural 21 .

    void closeTurn(){};
    // compare the count and give back reward to player if win.

}
