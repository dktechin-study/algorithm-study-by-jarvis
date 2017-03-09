package io.dktechin.jarvis.study;

import io.dktechin.jarvis.study.travel.Travel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TravelTest {

    @Test
    public void test() {
        Travel travel = new Travel();

        /* Case 1*/
        int[][] case1 = new int[][] {
                { 0, 14, 4, 10, 20 },
                { 14, 0, 7, 8, 7 },
                { 4, 5, 0, 7, 16 },
                { 11, 7, 9, 0, 2 },
                { 18, 7, 17, 4, 0 }
        };

        assertEquals(30, travel.minimumCost(case1));

        int[][] case2 = new int[][] {
                { 9, 9, 2, 9, 5 },
                { 6, 3, 5, 1, 5 },
                { 1, 8, 3, 3, 3 },
                { 6, 0, 9, 6, 8 },
                { 6, 6, 9, 4, 8 }
        };
        assertEquals(18, travel.minimumCost(case2));
    }
}
