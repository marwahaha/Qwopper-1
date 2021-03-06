package com.slowfrog.qwop;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MinDistFilterTest {

    @Test
    public void test() {

        RunInfo shortInfo = new RunInfo(null, 0, false, true, 0, 9);

        RunInfo longInfo = new RunInfo(null, 0, false, true, 0, 11);

        MinDistFilter fixture = new MinDistFilter(10);

        assertFalse(fixture.matches(shortInfo));

        assertTrue(fixture.matches(longInfo));

    }

}
