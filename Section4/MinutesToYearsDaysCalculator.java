package Section4;

public class MinutesToYearsDaysCalculator {
/**
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * The method should not return anything (void) and it needs to calculate 
 * the years and days from the minutes parameter.
 * If the parameter is less than 0, print text "Invalid Value".
 * Otherwise, if the parameter is valid then it needs to 
 * print a message in the format "XX min = YY y and ZZ d".
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 */
    public static void printYearsAndDays(final long minutes) {
        long hour = 0L;
        long days = 0L;
        long year = 0L;
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        hour = minutes / 60;
        days = hour / 24;
        year = days / 365;
        days = days % 365;
        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    } 
}
