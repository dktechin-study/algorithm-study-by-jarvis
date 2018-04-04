package io.dktechin.jarvis.algo.mailprogramming;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static io.dktechin.jarvis.algo.mailprogramming.Quiz11.*;

public class Quiz11Test {

    @Test
    public void testValidEncoded() {
        assertTrue(validEncoded("EGG", "FOO"));
        assertTrue(validEncoded("ABBCD", "APPLE"));
        assertFalse(validEncoded("AAB", "FOO"));
    }
}