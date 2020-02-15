package com.bowlingdesign.logic;

import java.util.ArrayList;

import com.bowlingdesign.frame.model.Frame;
import com.bowlingdesign.frame.model.FrameParser;
import com.bowlingdesign.line.model.Line;
import com.bowlingdesign.line.model.LineScorer;
import com.bowlingdesign.roll.model.Roll;
import com.bowlingdesign.roll.model.RollParser;

public class Bowling {

    private final RollParser rollParser;
    private final FrameParser frameParser;

    public Bowling(RollParser parser) {
        this.rollParser = parser;
        this.frameParser = new FrameParser();
    }

    public int scoreOf(String rollsAsString) {
        ArrayList<Roll> rolls = rollParser.parse(rollsAsString);
        ArrayList<Frame> frames = frameParser.parse(rolls);
        LineScorer scorer = new LineScorer(new Line(frames));

        return scorer.score();
    }

}
