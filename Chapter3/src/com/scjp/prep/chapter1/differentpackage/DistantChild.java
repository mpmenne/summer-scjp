package com.scjp.prep.chapter1.differentpackage;

import com.scjp.prep.chapter1.TheBasics;


/*

Why does this class have to be static???

--if not you would require an instance of the TheBasics class
in order to access the Parent

 */
public class DistantChild extends TheBasics.Parent {

    public void someMethod() {
        publicVariable++;
        protectedVariable++;    /* this is okay since it is protected   */
        //defaultVariable++;    /* not in the same package ... no access */

        TheBasics.Parent parent = new TheBasics.Parent();
        //parent.protectedVariable++;   /*  can't access.
        //GOTCHA!!!!
    }


}
