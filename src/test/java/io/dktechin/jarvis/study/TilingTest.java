package io.dktechin.jarvis.study;

import io.dktechin.jarvis.study.tiling.Tiling;
import org.junit.Assert;
import org.junit.Test;

public class TilingTest {

    @Test
    public void test() {
        Tiling tiling = new Tiling();
        Assert.assertEquals(171, tiling.solve(8));

    }
}
