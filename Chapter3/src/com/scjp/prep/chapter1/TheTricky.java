package com.scjp.prep.chapter1;

/**
 * *********************************************** TAPESTRY PROPRIETARY VER 2.0
 * <p/>
 * Copyright (C) 2011 Tapestry Solutions.
 * THIS PROGRAM IS PROPRIETARY TO TAPESTRY SOLUTIONS.
 * REPRODUCTION, DISCLOSURE, OR USE, IN WHOLE OR IN PART,
 * UNDERTAKEN EXCEPT WITH PRIOR WRITTEN AUTHORIZATION OF
 * TAPESTRY SOLUTIONS IS PROHIBITED.
 * <p/>
 * *********************************************** TAPESTRY PROPRIETARY VER 2.0
 */
public class TheTricky {

    /*
        !!!!!!All interface values are final!!!!!!

        how about constants in an interface

        You don't have to make your constants public, static, final, but if you don't weird things can happen
     */
    interface Foo {
        //all of these
        int BAR = 42;
        public int BAR1 = 42;
        public static int BAR5 = 42;
        public final int BAR2 = 42;
        public final static int BAR3 = 42;  //notice that the final and static are switched
        //all of the above is the same declaration as the one below
        public static final int BAR4 = 42;
        void go();
    }

    class Zap implements Foo {

        @Override
        public void go() {
            //BAR = 27;   //uncomment this line!!!!!
            //BAR1 = 28;  //uncomment this line!!!
        }
    }




}
