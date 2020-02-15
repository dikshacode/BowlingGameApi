package com.bowlingdesign.frame.model;

import com.bowlingdesign.roll.model.Roll;

public class Strike extends Frame {

    public Strike(Roll roll) {
        super(roll);
    }

    @Override
    public boolean isStrike() {
        return true;
    }
}
