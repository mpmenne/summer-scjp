package com.scjp.prep.OCA3OperatorsAndConstructs;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 7/24/13
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */

// This class focuses on examples of operators/Decision constructs

public class OperatorsAndConstructs {
    @Test
        public static void main(String[] args) {
            int k = 1;
            int[] a = { 1 };
            k += (k = 4) * (k + 2);
            a[0] += (a[0] = 4) * (a[0] + 2);
            System.out.println( k + " , " + a[0]);
        }
}
