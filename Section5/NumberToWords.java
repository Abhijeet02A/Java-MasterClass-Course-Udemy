package Section5;

public class NumberToWords {
/**
 * Write a method called numberToWords with one int parameter named number.
 * The method should print out the passed number using words for the digits.
 * If the number is negative, print "Invalid Value".
 */
    public static void numberToWords(final int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int temp = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++)  {
            switch (temp % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            temp = temp / 10;
        }
    }
/**
 * The method reverse should have one int parameter and return the reversed number (int). 
 * For example, if the number passed is 234, then the reversed number would be 432. 
 * The method  reverse should also reverse negative numbers.
 */
    public static int reverse(final int number) {
        int reverse = 0;
        int temp;
        if (number < 0) {
            temp = number * -1;
            while (temp > 0) {
                reverse = reverse * 10;
                reverse = reverse + temp % 10;
                temp = temp / 10;
            }
            return reverse * -1;
        }
        temp = number;
        int digitCount = getDigitCount(number);
        while (digitCount > 0) {
            reverse = reverse * 10;
            reverse = reverse + temp % 10;
            temp = temp / 10;
            digitCount--;
        }
        return reverse;
    }
/**
 * write a third method called getDigitCount.
 */
    public static int getDigitCount(final int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;
        int temp = number;
        while(temp > 9) {
            digitCount++ ;
            temp = temp / 10;
        }
        return digitCount;
    }
}
