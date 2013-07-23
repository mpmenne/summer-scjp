package com.scjp.prep.chapter3;

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
        //

        int a = Integer.parseInt("128");

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
        //since it is above 127 (or -128) these will always be boxed as Integers therefore different objects
        Integer i5 = 1000;
        Integer i6 = 1000;
        assertTrue(i5 != i6);  //different objects
    }

    @Test
    public void notSoSafeBecauseBelow127() {
        Integer i7 = 127;
        Integer i8 = 127;
        assertTrue(i7 == i8);  //same object because they get unboxed and are compared primitive to primitive
    }


}
