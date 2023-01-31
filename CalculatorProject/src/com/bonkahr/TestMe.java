package com.bonkahr;
import java.util.Scanner;

public class TestMe {
    protected double isNumber(String n){
        Scanner input = new Scanner(System.in);
        double a = 1;
        if (!n.isEmpty()){
            boolean t = true;
            while (t) {
                try {
                    a = Double.parseDouble(n);
                    t = false;
                } catch (Exception error) {
                    System.out.println("That was not a number, Try again:");
                    n = input.next();
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        TestMe test = new TestMe();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number");
        String input = scanner.next();
        System.out.println(test.isNumber(input));
    }
}
