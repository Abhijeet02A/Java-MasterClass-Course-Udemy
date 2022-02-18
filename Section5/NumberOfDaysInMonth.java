package Section5;

public class NumberOfDaysInMonth {
/**
 * Write a method isLeapYear with a parameter of type int named year. 
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false. 
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and 
 * return true if it is, otherwise return false. 
 */
    public static boolean isLeapYear(final int year) {
        if ((year >= 1 && year <= 9999) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            return true;
        } 
        return false;
    }
/**
 * Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
 * If parameter month is < 1 or > 12 return -1. ​
 * If parameter year is < 1 or > 9999 then return -1.
 * This method needs to return the number of days in the month. Be careful about leap 
 * years they have 29 days in month 2 (February).
 */
    public static int getDaysInMonth(final int month, final int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return 28;
            case 4: case 6:case 9:case 11:
                return 30;               
            default:
                return -1;
        }
    }
}
