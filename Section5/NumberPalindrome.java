package Section5;

public class NumberPalindrome {
/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 */
    public static boolean isPalindrome(final int number) {
        int reverseNumber = 0;
        int tempNumber;
        if (number < 0) {
            tempNumber = number * -1;
        } else {
            tempNumber = number;
        }
        while (tempNumber > 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        if (number < 0) {
            reverseNumber = reverseNumber * -1;
        }
        return reverseNumber == number;
    }
}
