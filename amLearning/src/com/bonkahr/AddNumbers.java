package com.bonkahr;

import java.util.Scanner;

public class AddNumbers {

    public static void numbers(){
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            Scanner numbers = new Scanner(System.in);
            System.out.print("Enter number " + counter + ": ");
            boolean nextNumber = numbers.hasNextInt();
            if (nextNumber) {
                int numberInput = numbers.nextInt();
                sum += numberInput;
                counter++;
            } else {
                System.out.println("Invalid number: " + counter);
            }
        }
        System.out.println(sum);
    }

    public static void maxAndMinimum(){
        Scanner number = new Scanner(System.in);
        int number1 = 0;
        int sum = 0;
        int n = 1;
        while (n < 2){
            System.out.print("Entre your number " + n + ": ");
            boolean invalidNumber = number.hasNextInt();
            if (invalidNumber) {
                number1 = number.nextInt();
                sum += number1;
                n++;
            }
            number.nextLine();
        }
        int number2 = sum - number1;
        System.out.println("maximum number is: " + Math.max(number1,number2));
        number.close();
    }

    public static void main(String[] args) {
        //numbers();
        maxAndMinimum();
    }

}
