package com.scjp.prep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 5/21/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class AutoboxingTest {

    @Test
    public void testSomething() {
        String s = "128";

        int a = Integer.parseInt(s);

        assertTrue(128 == a);
    }
    @Test
    public void unboxing() {
        Integer integer = Integer.valueOf("345534");
        assertTrue(345534==integer);
    }

    @Test
    public void boxing() {
        Integer i3 = 100;
        Integer i4 = 100;
        assertTrue(i3 == i4);
        assertTrue(i3.equals(i4));
    }

    @Test
    public void badIdea() {
        Integer i3 = 1000;
        Integer i4 = 1000;
        assertFalse(i3 == i4);
    }

    @Test
    public void alwaysSafe() {
        Integer i5 = 1000;
        int i6 = 1000;
        assertTrue(i5 == i6);
    }


}
