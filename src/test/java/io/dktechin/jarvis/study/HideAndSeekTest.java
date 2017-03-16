package io.dktechin.jarvis.study;

import io.dktechin.jarvis.study.bfs.HideAndSeek;
import org.junit.Assert;
import org.junit.Test;

public class HideAndSeekTest {

    @Test(timeout = 1000)
    public void test() {
        HideAndSeek hideAndSeek = new HideAndSeek();
        Assert.assertEquals(4, hideAndSeek.solve(5, 17));
    }
}
