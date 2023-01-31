import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        int[] array = getIntegers(6);
        printArray(array);
        System.out.println(Arrays.toString(sortArray(array)));

    }

    public static int[] getIntegers(int x){
        final Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[x];

        for (int i=0; i < userArray.length; i++){
            System.out.println("Enter your " + (i + 1) + " number." );
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number at " + i + " is " + array[i] );
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
//        for (int i= 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
