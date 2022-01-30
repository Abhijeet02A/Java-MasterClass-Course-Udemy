package Section4;

public class SpeedConvertor {

/**
 * Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. 
 * This method needs to return the rounded value of the calculation of type long.
 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an
 * invalid value.
 * 
 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to 
 * return -1 to indicate an invalid value. 
 * 
 * Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, 
 * check the notes in the text below.
 * 
 * 
 * NOTE: 1 mile per hour = is 1.609 kilometers per hour.
 * 
 * Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.
 * 
 * Examples of input/output:
 * toMilesPerHour(1.5); → should return value 1
 * toMilesPerHour(10.25); → should return value 6
 * toMilesPerHour(-5.6); → should return value -1
 * toMilesPerHour(25.42); → should return value 16
 * toMilesPerHour(75.114); → should return value 47
 * 
 * @param kilometerPerHour gets value in kilometersPerHour.
 * @return return calculated value in milesPerHour.
 * 
 */
    public static long  toMilesPerHour(final double kilometerPerHour) {
        if(kilometerPerHour < 0) {
            return -1;
        }else {
            double miles = 1 / 1.609 ;
            long milesPerHour = Math.round(miles * kilometerPerHour);
            return milesPerHour;
        }
    }

/**
 * Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
 * 
 * This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
 * 
 * Then it needs to print a message in the format "XX km/h = YY mi/h". 
 * 
 * XX represents the original value kilometersPerHour.
 * YY represents the rounded milesPerHour from the kilometersPerHour parameter.
 * 
 * If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
 * 
 * Examples of input/output:
 * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
 * printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
 * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
 * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
 * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
 * 
 * TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
 * 
 * @param kilometerPerHour gets value in kilometerPerHour
 */
    public static void printConversion(final double kilometerPerHour) {
        if(kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
