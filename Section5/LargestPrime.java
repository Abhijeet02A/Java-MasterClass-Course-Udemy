package Section5;

public class LargestPrime {
/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 * If the number is negative or does not have any prime numbers, 
 * the method should return -1 to indicate an invalid value.
 * The method should calculate the largest prime factor of a given number and return it.
 */
    public static int getLargestPrime(final int number) {
        if (number <= 1) {
            return -1;
        } 
        int temp = number;
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                temp = temp / i;
                i--;
            }
        }
        return temp;
    }
}
