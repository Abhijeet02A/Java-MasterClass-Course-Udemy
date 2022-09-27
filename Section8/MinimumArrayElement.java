package Section8;
import java.util.Scanner;

public class MinimumArrayElement {
    // private static Scanner scanner = new Scanner(System.in);
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
     
        return n;
        
    }
    
    private static int[] readElements(final int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count ; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    
     private static int findMin(int[] array) {
        int minimum = 999999;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
    
}