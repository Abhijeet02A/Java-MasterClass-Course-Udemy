package Section5;

public class GreatestCommonDivisor {
/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of the two numbers (int).
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers
 * (i.e. without leaving a remainder).
 */
    public static int getGreatestCommonDivisor(final int first, final int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int start;
        if (first < second) {
            start = first;
        }
            start = second;
        
        for (start++; start > 1 ; start--) {
            if (first % start == 0 && second % start == 0) {
                return start;
            }
        }
        return 1;
    }
}
