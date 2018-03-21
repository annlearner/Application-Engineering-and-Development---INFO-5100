package com.company;

public class SimplePlayer extends Player {
    @Override
    public boolean draw(Card dealer, Hand hand) {
        return false;
    }
}
