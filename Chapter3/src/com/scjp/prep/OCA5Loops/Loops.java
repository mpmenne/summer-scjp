package com.scjp.prep.OCA5Loops;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 7/29/13
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Loops {
    @Test
    public void increment() {
        int preInc, postInc;
        for (preInc = 0, postInc = 0; postInc < 1; ++preInc, postInc++) {
            System.out.println(preInc + " " + postInc);
        }
        System.out.println(preInc + " " + postInc);
    }

/*  The For Loop Breaks down like this:
        for (ForInit; Expression; ForUpdate){
            forLoopBody();
        }

        is exactly equivalent to the while loop:

        ForInit;
        while (expression) {
            forLoopBody();
            forUpdate;
*/

    @Test
    public void loopCompileTest() {
        int i, j;
        for (i = 0, j = 0; j < i; ++i, j++){
            System.out.println("Never Reached"); // Isn't an unreachable statement that prevents compiling because
                                                 // compiler doesn't know what values i & j will have until runtime
        }
        System.out.println("\nloopCompileTest: " + i + " " + j);
        }
}