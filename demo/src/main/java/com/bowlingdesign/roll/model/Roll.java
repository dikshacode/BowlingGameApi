package com.bowlingdesign.roll.model;

public class Roll {
    private int numberOfKnockedPins;

    public Roll(int numberOfKnockedPins) {
        this.numberOfKnockedPins = numberOfKnockedPins;
    }

    public int numberOfKnockedPins() {
        return numberOfKnockedPins;
    }

    public static Roll miss() {
        return new Roll(0);
    }
}
