package com.theIronyard;


import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GamePiece gp = new GamePiece();

//


//        print out the default values.
        System.out.println(gp);


//        test freeze method.
        gp.freeze();
        System.out.println("test freeze method " + gp);

//        test move method.
        gp.move(ThreadLocalRandom.current().nextInt(1, 100 + 1), ThreadLocalRandom.current().nextInt(1, 100 + 1));

//        print out values.
        System.out.println("test move method " + gp);


//        test unfreeze method.
        gp.unfreeze();


//        test move method.
        gp.move(ThreadLocalRandom.current().nextInt(1, 100 + 1), ThreadLocalRandom.current().nextInt(1, 100 + 1));

//        print out the values.
        System.out.println("test both methods " + gp);
    }
}