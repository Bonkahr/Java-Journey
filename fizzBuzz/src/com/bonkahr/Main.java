package com.bonkahr;

import java.util.Scanner;

public class Main {

    private static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fuzz Buzz";
        } else if (number % 3 == 0) {
            return "Fuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Its time to play Fizz Buzz");
        int loop = 0;
        while (loop < 100){

            System.out.println(fizzBuzz(loop));
            loop += 1;

            String correctAnswer = fizzBuzz(loop);
            System.out.println("Entre your answer: ");
            String userInput = scanner.nextLine();
            //String userInput = correctAnswer;

            if (!userInput.equals(correctAnswer)){
                System.out.println("That's not correct, correct answer is-> "
                        + correctAnswer);
                break;
            }
            else {
                loop += 1;
            }
        }
        if (loop >= 100){
            System.out.println("Congrats you won!");
        }
    }
}
