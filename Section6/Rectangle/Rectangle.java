package Section6.Rectangle;
/**
 * Write a class with the name Rectangle. 
 * The class needs two fields (instance variable) with name width and length both of type double.
 */
public class Rectangle {
    private double width;
    private double length;
    /**
     * The class needs to have one constructor 
     * with parameters width and length both of type double and it needs to initialize the fields.
     * In case the width parameter is less than 0 it needs to set the width field value to 0.
     * In case the length parameter is less than 0 it needs to set the length field value to 0.
     */
    public Rectangle(final double argWidth, final double argLength) {
        if (argWidth < 0) {
            this.width = 0;
        }
        else
        this.width = argWidth;
        if (argLength < 0) {
            this.length = 0;
        }
        else
        this.length = argLength;
        
    }
    /**
     * Method named getWidth without any parameters, it needs to return the value of width field.
     * @return width
     */
    public double getWidth() {
        return this.width;
    }
    /**
     * Method named getLength without any parameters, it needs to return the value of length field.
     * @return length
     */
    public double getLength() {
        return this.length;
    }
    /**
     * Method named getArea without any parameters, it needs to return the calculated area (width * length).
     * @return Area
     */
    public double getArea() {
        return this.length * this.width;
    }
}
