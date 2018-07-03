package io.dktechin.jarvis.algo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicate2Test {
    @Test
    public void containsNearbyDuplicate() throws Exception {
        int[] case_1_input_arr = {1, 2, 3, 1};
        int case_1_input_k = 3;

        int[] case_2_input_arr = {1,0,1,1};
        int case_2_input_k = 1;

        int[] case_3_input_arr = {1,2,3,1,2,3};
        int case_3_input_k = 2;

        assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(case_1_input_arr, case_1_input_k));
        assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(case_2_input_arr, case_2_input_k));
        assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(case_3_input_arr, case_3_input_k));
    }

}