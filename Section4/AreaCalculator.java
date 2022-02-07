package Section4;

public class AreaCalculator {
/**
 * Write a method named area with one double parameter named radius.
 * The method needs to return a double value that represents the area of a circle.
 * If the parameter radius is negative then return -1.0 to represent an invalid value.
 */
    public static double area(final double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
/**
 * Write another overloaded method with 2 parameters x and y (both doubles), 
 * where x and y represent the sides of a rectangle.
 * The method needs to return an area of a rectangle.
 * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 */
    public static double area(final double x, final double y) {
        double areaOfRectangle = 0;
        if (x < 0 || y < 0) {
            return -1;
        }
        areaOfRectangle = x * y;
        return areaOfRectangle;
    }
}
