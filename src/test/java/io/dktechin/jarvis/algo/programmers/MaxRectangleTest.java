package io.dktechin.jarvis.algo.programmers;

import io.dktechin.jarvis.algo.mailprogrammaing.MaxRectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxRectangleTest {

    @Test
    public void test() {
        int[][] map1 = {
                {0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 0, 1, 1}
        };

        int[][] map2 = {
                {0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 1}
        };


        assertEquals(6, MaxRectangle.solve(map1));
        assertEquals(9, MaxRectangle.solve(map2));

    }
}
