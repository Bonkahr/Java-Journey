package com.bonkahr.scope;

import java.util.Scanner;

public class X {
    private final int x;

    public X(Scanner x) {
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){

        for (int x = 1; x <= 12; x++){
            System.out.println(this.x + " multiplied by " + x + " is " + this.x * x);
        }
    }
}
