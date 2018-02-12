package io.dktechin.jarvis.algo.mailprogramming;

import io.dktechin.jarvis.algo.mailprogrammaing.IntegerPalindrome;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Input: 12345
 * Output: False
 *
 * Input: -101
 * Output: False
 *
 * Input: 11111
 * Output: True
 *
 * Input: 12421
 * ﻿Output: True
 */
public class IntegerPalindromeTest {

    @Test
    public void test() {
        assertFalse(IntegerPalindrome.solve(12345));
        assertFalse(IntegerPalindrome.solve(-101));
        assertTrue(IntegerPalindrome.solve(11111));
        assertTrue(IntegerPalindrome.solve(12421));
        assertTrue(IntegerPalindrome.solve(2442));

    }
}
