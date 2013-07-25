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
public class Enums {

    /*  Just remember enums CANNOT be declared in a METHOD.  That easy.*/

    /*  declare them as a member */
    enum CoffeeSize { BIG, HUGE, AWESOME }
    enum CoffeeSize1 { BIG, HUGE, AWESOME };  /***** Optional semi-colon!  *******/



    /*  notice that you can declare these private   */
    private enum JuiceSize { GLASS }
    /*  and protected                               */
    protected enum SodaSize { GULP, BIG_GULP }


}
