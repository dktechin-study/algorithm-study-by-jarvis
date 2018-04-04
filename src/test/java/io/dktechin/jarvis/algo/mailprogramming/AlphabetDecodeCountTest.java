package io.dktechin.jarvis.algo.mailprogramming;

import org.junit.Test;

import static io.dktechin.jarvis.algo.mailprogramming.AlphabetDecodeCount.countOfDecodeNumber;
import static org.junit.Assert.*;

public class AlphabetDecodeCountTest {

    @Test
    public void testCountOfDecodeNumber() {
        assertEquals(3, countOfDecodeNumber(111)); // aaa, ak, ka
        assertEquals(5, countOfDecodeNumber(1111)); // aaaa, aaak, aka, kaa, kk
        assertEquals(2, countOfDecodeNumber(127));  // abg, a
        // 애매한것은 z(26)을 넘어가는 경우 어떻게 처리해야할지를 모르겠다.
    }
}
