package com.scjp.prep.OCA8Exceptions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 7/22/13
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionsTests {

    @Test(expected = RuntimeException.class)
    public void throwUncheckedException() {
        throw new RuntimeException("Hey we don't need to catch this at all");
    }

    @Test (expected = Exception.class)
    public void throwCheckedException() throws Exception {
        throw new Exception("Yeah you better catch this one");
    }

    @Test
    public void catchThrownException() {
        try {
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("Caught you");
        }

    }

    @Test
    public void polymorphicException(){
        try{
            throw new Exception();
        }
        catch (RuntimeException e){
                Assert.fail(); //This wou;ld never happen because runtime exception is a subclass of Exception
        }
        catch (Exception e){
            //This passes
        }
    }

    @Test
    public void finallyAlwaysGetsCalledAfterException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("First the exception is caught");
        } finally {
            System.out.println("Then the finally statement is exeecuted");
        }
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void TryCatchFinallyWithCaughtException() {
        try {
            System.out.println("Starting Try block");
            throw new RuntimeException();
        } catch (RuntimeException rte) {
            System.out.println("Exception is caught"+"\n Throwing new error");
            thisWillBlowUp();
            return;
        } finally {
            System.out.println("Finally is executed");
            return;
        }
        //System.out.println("This statement will never be reached)");
    }

    private void thisWillBlowUp() {
        String[] strings = new String[5];
        String bad = strings[9];
    }


    @Test
    public void parseFloat(){
        String s = "";
        float v = funkyFinally(s);
        System.out.println(v);
    }

    private float funkyFinally(String s) {
        float f = 0.0f;
        float g = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            f = 9;
            return f;
        }
        finally{
            g = 10.0f;
            return f;
        }
    }

    @Test
    public void passByValueCaller() {
        int v;
        System.out.println("\n \n \n Starting passByValueTest");
        v = passByValueTest();
        System.out.println(v);

    }

    public int passByValueTest() throws NumberFormatException {
        String s = "one";
        Integer i;
        int passByValue = 1;

        try {
            i = Integer.parseInt(s);
            return passByValue;
        } catch (NumberFormatException nfe) {
            i = 0;
            passByValue = 2;
            return passByValue;
        } finally {
            passByValue = 3;
            return passByValue;
        }


    }


}

