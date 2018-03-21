package com.company;

public class CountingPlayer extends Player {


    @Override
    public boolean draw(Card dealer, Hand hand) {
        return false;
    }
}
