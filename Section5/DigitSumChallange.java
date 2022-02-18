package Section5;

public class DigitSumChallange {
/**
 * Write a method with the name sumDigits that has one int parameter called number. 
 * If parameter is >= 10 then the method should process the number and return sum of all digits, 
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers,
 * so also return -1 for negative numbers.
 */
    public static int sumDigits(final int number) {
        int sum = 0;
        int num = number;
        if (number < 10) {
             return -1;
        }
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        } 
        return sum;
    }
}
