package io.dktechin.jarvis.algo.acmicpc;

import io.dktechin.jarvis.algo.acmicpc.a13913.HideAndSeek4;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HideAndSeekTest4 {

    private final static long LIMIT_TIME = 2 * 1000;

    @Test(timeout = LIMIT_TIME)
    public void test() {
        HideAndSeek4 hideAndSeek = new HideAndSeek4();
        int[] result = hideAndSeek.solve(5, 17);
        assertArrayEquals(new int[] { 5, 4, 8, 16, 17 }, result);
        Assert.assertEquals(4, result.length - 1);
    }
}
