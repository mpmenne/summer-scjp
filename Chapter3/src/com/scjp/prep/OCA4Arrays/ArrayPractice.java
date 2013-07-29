package com.scjp.prep.OCA4Arrays;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 7/25/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayPractice {
    @Test
    public static void main(String[] args) {
        A[] a, a1; // initialize and populate arrays of objects A and B
        B[] b;
        a = new A[10]; a1 = a;
        b = new B[20];
        b = (B[]) a;
        // b = (B[]) a1;
    }

    class A {}
    class B extends A {}
}
