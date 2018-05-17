package io.dktechin.jarvis.algo.mailprogramming;

import org.junit.Test;

import static io.dktechin.jarvis.algo.mailprogramming.Quiz17.*;
import static io.dktechin.jarvis.algo.mailprogramming.Quiz17.Pos;
import static org.junit.Assert.assertEquals;

public class Quiz17Test {

    @Test
    public void testSolve() {
        // @formatter:off
        int[][] case_1 =
                {{1, 0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}};
        // @formatter:on
        int expectedCase_1 = 8;

        assertEquals(expectedCase_1, solve(case_1, new Pos(0, 0), new Pos(4, 0)));
    }
}