package com.company;


import java.util.Arrays;

public class Card {

    private final String[] SuitNames = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private final String[] SpotNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private Spot spot;
    private Suit suit;

    Card(Spot spot, Suit suit){
        this.spot = spot;
        this.suit = suit;
    };

    public Suit getSuit(){
        return suit;
    }

    public Spot getSpot(){
        return spot;
    }

    @Override
    public String toString() {
        return SpotNames[spot.ordinal()] + " of " + SuitNames[suit.ordinal()];
    }
}
