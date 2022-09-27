package Section8;

import java.util.Arrays;

public class ReverseArray {
/**
 * Write a method called reverse() with an int array as a parameter.
 * The method should not return any value. In other words, the method is allowed to modify the array parameter.
 * To reverse the array, you have to swap the elements, 
 * so that the first element is swapped with the last element and so on.
 * and then once it's been reversed, print it out as Reversed
 * TODO: change to private
 */
    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int last = array.length -1;
        int first = 0;
        int temp;
        while (first < last) {
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            last--;
            first++;
        }
        
            System.out.println("Reversed array = " + Arrays.toString(array));
        
    }
}
