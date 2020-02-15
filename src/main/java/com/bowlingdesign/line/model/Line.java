package com.bowlingdesign.line.model;

import java.util.ArrayList;
import java.util.Collection;

import com.bowlingdesign.frame.model.Frame;

public class Line {
    public static final int NUMBER_OF_TURNS = 10;

    private ArrayList<Frame> frames;

    public Line(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public Collection<Frame> frames() {
        return frames.subList(0, NUMBER_OF_TURNS);
    }

    public Frame next(Frame frame) {
        int numberOfTurn = frames.indexOf(frame);
        return frames.get(numberOfTurn + 1);
    }
}
