package com.scjp.prep.OCA6ConstructorsMethodsEncapsulation;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 7/29/13
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeTest {
    private int myValue = 0;

    public void showOne (int myValue) {
        myValue = myValue;
        System.out.println(this.myValue);
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
        System.out.println(myValue);
    }

    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showOne(100);
        ct.showTwo(200);
    }
}
