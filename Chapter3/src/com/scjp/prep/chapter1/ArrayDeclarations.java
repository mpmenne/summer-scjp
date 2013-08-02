package com.scjp.prep.chapter1;

/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 7/31/13
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayDeclarations {

    private int[] standardArray = new int[5];
    private int[][] multidimensionalArray = new int[4][4];
    //private int[3] cantDoThis = new int[3];  /*can't do this*/
    private int[][][] reallyDeep = new int[3][3][3];
    private int[][] differentDimensions = new int[1][3];
    private static int[][] canWeHaveAZero = new int[1][0];  /*  Whoa!!!!  */
    private int[][] dontBotherInitializingTheSecondDimension = new int[4][];
    private int[] thisIsWeird[] = new int[4][];
    private int thisIsSoStrange[][] = new int[5][4];  /* dont do things this way... just added for C programmers */
    private int[] shortcutInitializer = { 1, 2, 3, 4 };

    static {
        canWeHaveAZero[1][0] = 1;  /* okay so this works... */
    }



}
