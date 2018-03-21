package com.company;

public class Dealer extends Player {

    GroupOfCards memoryCard;

    @Override
    public boolean draw(Card dealer, Hand hand) {
        return false;
    }
}
