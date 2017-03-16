package io.dktechin.jarvis.algo.acmicpc;

import io.dktechin.jarvis.algo.acmicpc.a1697.HideAndSeek;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HideAndSeekTest {

    private final static long LIMIT_TIME = 2 * 1000;

    @Test(timeout = LIMIT_TIME)
    public void test() {
        HideAndSeek hideAndSeek = new HideAndSeek();
        assertEquals(4, hideAndSeek.solve(5, 17));

    }

    @Test(timeout = LIMIT_TIME)
    public void test2() {
        HideAndSeek hideAndSeek = new HideAndSeek();
        assertEquals(18, hideAndSeek.solve(6, 100000));
    }
}
