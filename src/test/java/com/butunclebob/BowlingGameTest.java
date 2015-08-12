package com.butunclebob;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void shouldScoreGutterGame() {
        rollMany(20, 0);

        assertThat(bowlingGame.getScore(), is(0));
    }

    @Test
    public void shouldScoreAllOnes() {
        rollMany(20, 1);

        assertThat(bowlingGame.getScore(), is(20));
    }

    @Test
    public void shouldScoreOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);

        assertThat(bowlingGame.getScore(), is(16));
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            bowlingGame.roll(pins);
        }
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }
}
