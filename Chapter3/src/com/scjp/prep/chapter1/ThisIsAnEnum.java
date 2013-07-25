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

/*****
 *
 * Enums must be public or default!!!!
 * (private and protected will cause errors)
 *
 * BAD  private enum ThisIsAnEnum
 * BAD  protected enum ThisIsAnEnum
 *
 * Enums allow you to encapsulate constants with more than just one static value!
 * How cool is that?
 *
 * What about if you want to make an exception for one constant?
 *
 *
 *
 ******/
enum ThisIsAnEnum {

    BIG(5), HUGE(12), AWESOME(64) {
        public String getCoolFactor() {
            return "Awesome";
        }
    };

    ThisIsAnEnum(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }

    public String getCoolFactor() {
        return "pretty good";
    }
}
