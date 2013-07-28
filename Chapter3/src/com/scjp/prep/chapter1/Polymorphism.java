package com.scjp.prep.chapter1;

import org.junit.Test;

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
public class Polymorphism {

    private interface Animal {
        public String makeSomeNoise();
    }

    private class Penguin implements Animal {
        @Override
        public String makeSomeNoise() {
            return "Quack Quack";
        }
    }

    private class Cow implements Animal {
        @Override
        public String makeSomeNoise() {
            return "Moooooo";
        }
    }

    @Test
    public void letsMakeSomeAnimals() {
        Animal animal = new Penguin();
        System.out.println("Penguin says: " + animal.makeSomeNoise());
        animal = new Cow();
        System.out.println("Cow says: " + animal.makeSomeNoise());
    }

    @Test
    public void whyIsThisSomewhatCool() {
        Animal[] animals = new Animal[] { new Penguin(), new Cow(), new Cow(), new Penguin() };
        for (Animal animal : animals) {
            System.out.println(animal.makeSomeNoise());
        }
    }

    private interface FlyingCreature {
        public String fly();
    }

    private class HummingBird implements Animal, FlyingCreature {
        @Override
        public String makeSomeNoise() {
            return ".....";
        }
        @Override
        public String fly() {
            return "flapping really fast, flapping really fast";
        }
    }

    @Test
    public void whatCanAHummingbirdDo() {
        Animal animal = new HummingBird();
        FlyingCreature flyingCreature = new HummingBird();
        System.out.println("Hummingbird says: " + animal.makeSomeNoise());
        System.out.println("Hummingbird flying: " + flyingCreature.fly());

        HummingBird hummingBird = new HummingBird();
        System.out.println(hummingBird.fly() + "     " + hummingBird.makeSomeNoise());
    }

    /* you can extend interfaces just like classes*/
    private interface Bear extends Animal {
        public String breakStuff();
    }

    private class KungfuPanda implements Bear {
        @Override
        public String breakStuff() {
            return "Heeeee - YAAAAA";
        }
        @Override
        public String makeSomeNoise() {
            return "What up!";
        }
    }

    private class BrownBear implements Bear {
        @Override
        public String breakStuff() {
            return "smash, shatter, claw";
        }
        @Override
        public String makeSomeNoise() {
            return "ROAARRR!";
        }
    }

    @Test
    public void justForFunLetsCheckOutTheBears() {
        Bear kungfuPandaBear = new KungfuPanda();
        Bear brownBear = new BrownBear();
        System.out.println(kungfuPandaBear.breakStuff());
        System.out.println(brownBear.breakStuff());
    }

    @Test
    public void youGuysKnowAboutInlineAnonymousClassesRight() {
        System.out.println(new Bear() {
            @Override
            public String breakStuff() {
                return "ZZZZZzzzzz";
            }

            @Override
            public String makeSomeNoise() {
                return "ZZZZZzzzzz";
            }
        });
    }

    private class KungFuPandaTheSequel extends KungfuPanda {
        @Override
        public String breakStuff() {
            return "Chew on my fist!";
        }
    }

}
