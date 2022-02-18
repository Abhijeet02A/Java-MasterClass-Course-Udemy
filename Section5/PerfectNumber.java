package Section5;

public class PerfectNumber {
/**
 * Write a method named isPerfectNumber with one parameter of type int named number. 
 * If number is < 1, the method should return false.
 * The method must calculate if the number is perfect.
 * If the number is perfect, the method should return true; otherwise, it should return false.
 */
    public static boolean isPerfectNumber(final int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
