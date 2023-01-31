package com.bonkahr;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Entre your name: ");
        String name = scan.nextLine();

        System.out.println("You are "+ name + " of " + age + " years old");

    }
}