package io.dktechin.jarvis.algo.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HavenOfPedestrianTest {

    @Test
    public void test() {
        int case1_input_m = 3;
        int case1_input_n = 3;
        int[][] case1_input_map = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        int case1_expected = 6;

        int case2_input_m = 3;
        int case2_input_n = 6;
        int[][] case2_input_map = {
                {0, 2, 0, 0, 0, 2},
                {0, 0, 2, 0, 1, 0},
                {1, 0, 0, 2, 2, 0}};
        int case2_expected = 2;

        HavenOfPedestrian.Solution solution = new HavenOfPedestrian.Solution();

        assertEquals(case1_expected, solution.solution(case1_input_m, case1_input_n, case1_input_map));
        assertEquals(case2_expected, solution.solution(case2_input_m, case2_input_n, case2_input_map));
    }
}