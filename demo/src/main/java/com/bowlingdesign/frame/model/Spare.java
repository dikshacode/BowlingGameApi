package com.bowlingdesign.frame.model;

import com.bowlingdesign.roll.model.Roll;

public class Spare extends Frame {
    public Spare(Roll firstRoll, Roll secondRoll) {
        super(firstRoll, secondRoll);
    }

    @Override
    public boolean isSpare() {
        return true;
    }
}
