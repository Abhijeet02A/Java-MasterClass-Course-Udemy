package Section6;

/**
 * The Carpet Company has asked you to write an application that calculates the price of carpeting 
 * for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by 
 * the price per square meter of carpet. For example, the area of the floor that is 
 * 12 meters long and 10 meters wide is 120 square meters. 
 * To cover the floor with a carpet that costs $8 per square meter would cost $960.
 */
/**
 * Write a class with the name Floor.
 * The class needs two fields (instance variables) with name width and length of type double.
 */
public class Floor {
    private double width;
    private double length;
    public Floor() {

    }
/**
 * The class needs to have one constructor with parameters width and length of type double 
 * and it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, 
 * in case the length parameter is less than 0 it needs to set the length field value to 0.
 * @param width
 * @param length
 */
    public Floor(final double width,final double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
/**
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 * @return
 */
    public double getArea() {
        return this.length * this.width;
    }
}
