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
public class TheBasics {


    /*   This one won't work!  */
    //private int e#;

    /*  Access Levels
         public  -  everyone can access it

         private  - only code in the class can access it  (no inheritance)

         ***default  -  only code in the same package can access it

         ***protected  -  only code in the same package can access it
                       ***caveat***   can be accessed via inheritance
     */

    public static class Parent {
        public int publicVariable = 0;
        protected int protectedVariable = 1;
        int defaultVariable = 2;
        private int privateVariable = 3;
    }

    public class Child extends Parent {
        public void someMethod() {
            publicVariable++;
            protectedVariable++;
            defaultVariable++;
            //privateVariable++;    /*   won't work!   */

            //check out TrickyProtectedVisiblity.java for the gotcha
        }

    }

    /*  This is kind of crazy!  */
    public abstract class AbstractSuperSuperClass{
        public abstract void thisMethodHasToBeExtended();
    }

    public abstract class AbstractSuperclass extends AbstractSuperSuperClass {
        public abstract void thisMethodHasToBeExtended();
    }

    public class ConcreteClass extends AbstractSuperclass {
        @Override
        public void thisMethodHasToBeExtended() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }


}
