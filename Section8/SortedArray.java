package Section8;
/**
 * Create a program using arrays that sorts a list of integers in descending order.
 * Descending order is highest value to lowest.
 * In other words if the array had the values in it [106, 26, 81, 5, 15] 
 * your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
 * Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
 */

import java.util.Scanner;

public class SortedArray {

/**
 * getIntegers has one parameter of type int which is the size of the array. 
 * It returns an array of entered integers from the keyboard.
 */
    public static int[] getIntegers(final int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0 ; i < size; i++) {
          array[i] = scanner.nextInt();  
        }
        return array;
    }
/**
 * printArray accepts an array and prints out the contents of the array.
 * It should be printed in the following format:
 * Element 0 contents 106
 * Element 1 contents 81
 */
    public static void printArray(final int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

/**
 * sortIntegers accepts the unsorted array. 
 * It should sort the array and return a new array containing the sorted numbers.
 */
    public static int[] sortIntegers(final int[] arr) {
        int n = arr.length;
  
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] > arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
