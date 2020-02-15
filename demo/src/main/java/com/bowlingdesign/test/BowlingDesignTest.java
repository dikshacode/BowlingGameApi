package com.bowlingdesign.test;


import org.junit.Test;

import com.bowlingdesign.logic.Bowling;
import com.bowlingdesign.logic.StringRollParser;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BowlingDesignTest {

    @Test
    public void score_0_failing_all_rolls() {
        assertThat(scoreOf("--------------------"), is(0));
    }

    @Test
    public void score_1_first_roll_hit_one_pin_and_miss_other() {
        assertThat(scoreOf("1-------------------"), is(1));
    }

    @Test
    public void score_2_first_roll_hit_two_pin_and_miss_other() {
        assertThat(scoreOf("2-------------------"), is(2));
    }

    @Test
    public void score_20_all_rolls_hit_one_pin() {
        assertThat(scoreOf("11111111111111111111"), is(20));
    }

    @Test
    public void score_10_first_turn_do_spare() {
        assertThat(scoreOf("3/------------------"), is(10));
    }

    @Test
    public void score_10_first_turn_do_a_strike() {
        assertThat(scoreOf("X------------------"), is(10));
    }

    @Test
    public void get_next_hit_bonus_after_spare() {
        assertThat(scoreOf("3/3-----------------"), is(16));
    }

    @Test
    public void not_a_spare_score_of_10_in_two_different_turns_consecutive_rolls() {
        assertThat(scoreOf("3553----------------"), is(16));
    }

    @Test
    public void be_next_two_rolls_of_bonus_after_strike() {
        assertThat(scoreOf("X53----------------"), is(26));
    }

    @Test
    public void scores_300_a_perfect_game() {
        assertThat(scoreOf("XXXXXXXXXXXX"), is(300));
    }

    @Test
    public void scores_150_all_the_turns_with_spare_and_the_last_bonus_5() {
        assertThat(scoreOf("5/5/5/5/5/5/5/5/5/5/5"), is(150));
    }

    private int scoreOf(String rolls) {
        Bowling bowling = new Bowling(new StringRollParser());
        return bowling.scoreOf(rolls);
    }

}
