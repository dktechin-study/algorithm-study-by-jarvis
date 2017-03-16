package io.dktechin.jarvis.algo.study;

import io.dktechin.jarvis.algo.study.calamity.CalamityOfBook;
import org.junit.Assert;
import org.junit.Test;

public class CalamityOfBookTest {

    @Test
    public void test() {
        int x = 2;
        System.out.println("====책.");
        String[] map = new String[] {
                "FOOOE",
                "OOOOO",
                "OOOOO",
                "OOOOO",
                "YOFFO"
        };
        CalamityOfBook calamity = new CalamityOfBook(x, map);
        CalamityOfBook.MoveHistory moveHistory = calamity.findLoad();

        if ( moveHistory.escaped() ) {
            System.out.println(moveHistory.getCount());
            System.out.println(moveHistory.getDirection());
        } else {
            System.out.println("not escaped");
        }

        Assert.assertEquals(8, moveHistory.getCount());
        Assert.assertEquals("UURURRUR", moveHistory.getDirection());
    }

}
