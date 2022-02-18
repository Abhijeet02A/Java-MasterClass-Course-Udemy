package Section5;

public class LastDigitChecker {
/**
 * Write a method named hasSameLastDigit with three parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if at least two of the numbers share the same rightmost digit;
 * otherwise, it should return false.
 */
    public static boolean hasSameLastDigit(final int first, final int second, final int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }
        if (first % 10 == second % 10 || first % 10 == third % 10 || second % 10 == third % 10) {
            return true;
        }
        return false;
    }
/**
 * Write another method named isValid with one parameter of type int.
 * The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), 
 * otherwise return false.
 */
    public static boolean isValid(final int number) {
        if (number < 10 || number > 1000 ) {
            return false;
        }
        return true;
    }
}
/**
 * 


EXAMPLE INPUT/OUTPUT

* isValid(10); → should return true since 10 is within the range of 10-1000

* isValid(468); → should return true since 468 is within the range of 10-1000

* isValid(1051); → should return false since 1051 is not within the range of 10-1000


NOTE: All methods need to be defined as public static as we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */