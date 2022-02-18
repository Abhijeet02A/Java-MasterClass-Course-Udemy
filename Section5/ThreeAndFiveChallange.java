package Section5;

public class ThreeAndFiveChallange {
/**
 * Create a for statement using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided with both 3 and also with 5.
 * For those numbers that met the above conditions, print out the number.
 * break out of the loop once you find 5 numbers that met the above conditions.
 * After breaking out of the loop print the sum of the numbers that met the above conditions.
 */ 
    public static void sumOfDivisibleByTF() {
        int sum = 0;
        int count = 0;
        for (int number = 1; number <= 1000; number ++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                 sum = sum + number;
                 count++; 
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}
