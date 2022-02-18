package Section5;

public class DiagonalStar {
/**
 * Write a method named printSquareStar with one parameter of type int named number.
 * If number is < 5, the method should print "Invalid Value".
 * The method should print diagonals to generate a rectangular pattern composed of stars (*).
 * This should be accomplished by using loops (see examples below).
 */
    public static void printSquareStar(final int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if ( j == number || i == 1 || j == 1 || i == number || i + j == number + 1 || i == j   ) {
                    System.out.print("*");
                } else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
