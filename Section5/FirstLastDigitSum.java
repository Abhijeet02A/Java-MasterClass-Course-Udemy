package Section5;

public class FirstLastDigitSum {
/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
    public static int sumFirstAndLastDigit(final int number) {
        int tempNumber;
        if (number < 0) {
            return -1;
        }
        tempNumber = number;
        int sum = 0;
        sum = sum + tempNumber % 10;
        while (tempNumber > 9) {
            tempNumber /= 10;
        }
        sum = sum + tempNumber;
        return sum;
    }
}
