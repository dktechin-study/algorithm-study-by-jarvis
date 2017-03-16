package io.dktechin.jarvis.algo.study;

import io.dktechin.jarvis.algo.study.tiling.Tiling;
import org.junit.Assert;
import org.junit.Test;

public class TilingTest {

    @Test
    public void test() {
        Tiling tiling = new Tiling();
        Assert.assertEquals(171, tiling.solve(8));

    }
}
