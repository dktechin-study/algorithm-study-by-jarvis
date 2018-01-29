package io.dktechin.jarvis.algo.mailprogramming;

import io.dktechin.jarvis.algo.mailprogrammaing.FibonacciSum;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciSumTest {

    @Test
    public void test() {
        Assert.assertEquals(10, FibonacciSum.sum(12));
        Assert.assertEquals(188, FibonacciSum.sum(144));
    }
}
