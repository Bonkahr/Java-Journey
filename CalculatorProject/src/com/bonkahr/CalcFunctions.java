package com.bonkahr;

import java.util.Scanner;

public class CalcFunctions {

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

    protected double addition(double a, double b){
        return  a + b;
    }

    protected double subtraction(double a, double b){
        return a - b;
    }

    protected double division(double a, double b){
        return  a / b;
    }

    protected  double multiplication(double a, double b){
        return a * b;
    }

    protected double square(double a){
        return a * a;
    }

    protected double squareRoot(double a){
        return Math.sqrt(a);
    }

    protected  double cubeRoot(double a){
        return Math.cbrt(a);
    }

    protected long factorial(int a){
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    protected long power(int a, int b){
        long answer = 1;
        for (long i = 0; i < b; i ++){
            answer *= a;
        }
        return answer;
    }

    public static void main(String[] args) {
        CalcFunctions calc = new CalcFunctions();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the menu below, 1 to 9, 0 to quit and" +
                " any number greater than 9 to show menu again");
        String menu = ("""
                1: Addition
                2: Subtraction
                3: Division
                4: Multiplication
                5: Square
                6: Square-Root
                7: Cube-Root
                8: Factorial
                9: Power
                0: quit
                """);
        System.out.println(menu);
        String user_input = scanner.next();
        double input = calc.isNumber(user_input);
        while ((int) input >= 10){
            System.out.println("That's not in the menu, input a valid number!");
            System.out.println(menu);
            String trio = scanner.next();
            input = calc.isNumber(trio);
        }

        switch ((int) input) {
            case 1 -> {
                System.out.println("Input two numbers to add");
                String one = scanner.next();
                double a = calc.isNumber(one);
                String two = scanner.next();
                double b = calc.isNumber(two);
                System.out.println(calc.addition(a, b));
            }
            case 2 -> {
                System.out.println("Input two numbers to subtract");
                String subOne = scanner.next();
                double c = calc.isNumber(subOne);
                String subTwo = scanner.next();
                double d = calc.isNumber(subTwo);
                System.out.println(calc.subtraction(c, d));
            }
            case 3 -> {
                System.out.println("Input two numbers to divide");
                String divideOne = scanner.next();
                double e = calc.isNumber(divideOne);
                String divideTwo = scanner.next();
                double f = calc.isNumber(divideTwo);
                System.out.println(calc.division(e, f));
            }
            case 4 -> {
                System.out.println("Input two numbers to multiply");
                String multiplyOne = scanner.next();
                double g = calc.isNumber(multiplyOne);
                String multiplyTwo = scanner.next();
                double h = calc.isNumber(multiplyTwo);
                System.out.println(calc.multiplication(g, h));
            }
            case 5 -> {
                System.out.println("Input a number to square");
                String squareOne = scanner.next();
                double i = calc.isNumber(squareOne);
                System.out.println(calc.square(i));
            }
            case 6 -> {
                System.out.println("Input a number to square-ROOT");
                String rootOne = scanner.next();
                double j = calc.isNumber(rootOne);
                System.out.println(calc.squareRoot(j));
            }
            case 7 -> {
                System.out.println("Input a number to Cube-root");
                String cubeOne = scanner.next();
                double k = calc.isNumber(cubeOne);
                System.out.println(calc.cubeRoot(k));
            }
            case 8 -> {
                System.out.println("Input a number to get factorial");
                String factorial = scanner.next();
                double l = calc.isNumber(factorial);
                System.out.println(calc.factorial((int) l));
            }
            case 9 -> {
                System.out.println("Input two numbers to get power");
                String powerOne = scanner.next();
                double m = calc.isNumber(powerOne);
                String powerTwo = scanner.next();
                double n = calc.isNumber(powerTwo);
                System.out.println(calc.power((int) m, (int) n));
            }
            case 0 -> System.out.println("Thank you for trying out, Run again to " +
                    "restart");
        }
    }
}
