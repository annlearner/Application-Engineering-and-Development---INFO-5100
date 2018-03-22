package com.company;

public enum Spot {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING, ACE;

    public int getValue(){
        if(this.ordinal() <= 8){
            return this.ordinal() + 2;
        }else if(this.ordinal() <= 11) {
            return 10;
        }else{
            return 1;
        }
    }
}

// for (Spot e : Spot.values()) {
//         System.out.println(e.toString());
// }
