package com.butunclebob;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BowlingGameTest {

    @Test
    public void shouldScoreWhenAllRollsGuttered() {
        BowlingGame bowlingGame = new BowlingGame();

        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }

        assertThat(bowlingGame.getScore(), is(0));
    }
}
