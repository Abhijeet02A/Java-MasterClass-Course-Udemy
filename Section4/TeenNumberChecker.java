package Section4;

public class TeenNumberChecker {
/**
 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 * Write a method named hasTeen with 3 parameters of type int.
 * The method should return boolean and it needs to return true if one of the
 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 * @param firstNumber gets firstNumber
 * @param secondNumber gets secondNumber
 * @param thirdNumber gets thirdNumber
 */
    public static boolean hasTeen(final int firstNumber, final int secondNumber, final int thirdNumber) {
        if(firstNumber >= 13 && firstNumber <= 19) {
            return true;
        }else if(secondNumber >= 13 && secondNumber <= 19) {
            return true;
        }else if(thirdNumber >= 13 && thirdNumber <= 19) {
            return true;
        }
        return false;
    }
/**
 * Write another method named isTeen with 1 parameter of type int.
 * The method should return boolean and it needs to return true if
 * the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 * @param number get number
 */
    public static boolean isTeen(final int number) {
        if(number >= 13 && number <= 19) {
            return true;
        }
        return false;
    }
}
