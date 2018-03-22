package com.company;

public class CountingPlayer extends Player {

    int memoryCard;

    CountingPlayer(int bankroll, int minimum){
        super(bankroll, minimum);
        memoryCard = 0;
    }

    @Override
    public int bet() {
        return 0;
    }

    @Override
    public boolean draw(Card dealer) {
        return false;
    }

    @Override
    public void expose(Card c) {

    }

    @Override
    public void shuffled() {

    }
}

