package io.dktechin.jarvis.algo.programmers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifoSchedulingTest {

    @Test
    public void testGetCoreNumber() {
        FifoScheduling fifo = new FifoScheduling();
        int[] core_1 = { 1, 2, 3 };
        int jobs_1 = 6;
        int expected_1 = 2;
        Assert.assertEquals(expected_1, fifo.getCoreNumber(jobs_1, core_1));
    }
}