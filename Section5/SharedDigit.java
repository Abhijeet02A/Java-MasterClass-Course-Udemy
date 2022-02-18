package Section5;

public class SharedDigit {
/**
 * Write a method named hasSharedDigit with two parameters of type int. 
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, 
 * such as 2 in 12 and 23; otherwise, the method should return false.
 */ 
    public static boolean hasSharedDigit(final int first, final int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99 ) {
            return false;
        }
        int number1 = first;
        int number2 = second;
        int lastDigit1 = 0;
        int lastDigit2 = 0;
        while (number1 > 9) {
            lastDigit1 = number1 % 10;
            lastDigit2 = number2 % 10;
            number1 = number1 / 10;
            number2 = number2 / 10;
        }
        if (number1 == number2 || number2 == lastDigit1 || number1 == lastDigit2 || lastDigit1 == lastDigit2) {
            return true;
        }
        return false;
    }
}
