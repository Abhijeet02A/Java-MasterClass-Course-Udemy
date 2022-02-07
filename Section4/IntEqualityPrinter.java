package Section4;

public class IntEqualityPrinter {
/**
 * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
 * If one of the parameters is less than 0, print text "Invalid Value".
 * If all numbers are equal print text "All numbers are equal"
 * If all numbers are different print text "All numbers are different".
 * Otherwise, print "Neither all are equal or different".
 */
    public static void printEqual(final int first, final int second, final int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
