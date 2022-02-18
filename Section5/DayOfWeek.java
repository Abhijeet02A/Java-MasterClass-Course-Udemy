package Section5;

public class DayOfWeek {
/**
 * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
 * The method should not return any value (hint: void)
 * Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter 
 * gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
 */
    public static void printDayOfTheWeek(final int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }    
}
