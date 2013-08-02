package com.scjp.prep.chapter1;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 8/1/13
 * Time: 12:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlowControl {

    @Test
    public void canABreakExitAnIf() {
        if (true) {
            //break;  /* doesn't compile... must be inside loop  */
        }
    }

    @Test
    public void emptyForStatements() {
        for ( ; true; ) {

        }
    }

    @Test
    public void thisIsHowYouWriteASwitchStatement() {
        //earlier versions of Java only allowed switches on ints
        switch(1) {
            case 2 : {
                System.out.println("Hey!");
                break;
            }
            default: break;
        }

    }


}
