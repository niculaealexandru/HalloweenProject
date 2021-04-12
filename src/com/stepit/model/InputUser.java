package com.stepit.model;

import java.io.File;
import java.util.Scanner;

public class InputUser {
    private final static Scanner SCANNER = new Scanner(System.in);



    public static boolean inputMethod(String question, String alternativeA, String alternativeB, String alternativeC, String corectAnswer) {
        File laugh = new File("laugh.wav");
        Image sc = new Image();
        System.out.println(question);
        System.out.println("a: " + alternativeA + "\nb: " + alternativeB + "\nc: " + alternativeC);
        String input = null;
        if (SCANNER.hasNext()) {
            input = SCANNER.next();
        } else {
            System.out.println("OPSS!!  Something went wrong!");
        }
        if (input != null) {
            if (input.equals(corectAnswer)) {
                return true;
            } else {
                System.out.println("You died!");
                sc.displayImage("scary.jpg","scary.wav");
            }
        }
        return false;
    }

}
