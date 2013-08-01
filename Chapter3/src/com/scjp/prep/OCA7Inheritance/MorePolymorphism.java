package com.scjp.prep.OCA7Inheritance;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: zempelc
 * Date: 8/1/13
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */

public class MorePolymorphism {

    class Baap{
        public int h = 4;
        public int getH(){System.out.println("Baap     " +h); return h;}}
    }

    class Beta extends Baap {
        public int h = 44;
        public int getH(){System.out.println("Beta    "+h); return h;} }


    Baap b = new Beta();
    System.out.println(b.h +"   "+b.getH());

/*
    public class One implements Observer{}
    public class Two extends One implements Runnable{}
    public class Three extends Two {}

    public interface Runnable {}
    public interface Observer{}

    @Test
    public void run(){
        One one = new One();
        Two two = new Two();

        Object o = one;  //Observer O = o;
        Observer O = (Observer) one;
        Observer O2 = one;
    }
    */
}