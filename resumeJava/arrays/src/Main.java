import java.util.Scanner;

public class Main {

    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 2;
        }
        for (int s : myIntArray){
            System.out.println(s);
        }

        System.out.println("Average : " + average(getIntegers(6)));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double average(int[] array) {
        double total = 0;
        for (int x: array) {
            total += x;
        }
        return total / (double) array.length;
    }
}