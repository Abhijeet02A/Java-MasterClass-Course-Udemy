package Section6.Rectangle;
/**
 * Write a class with the name Cuboid that extends Rectangle class. 
 * The class needs one field (instance variable) with name height of type double.
 */
public class Cuboid extends Rectangle{
    private double height;
    /**
     * The class needs to have one constructor with three parameters width, length, and height all of type double. 
     * It needs to call parent constructor and initialize a height field.
     * In case the height parameter is less than 0 it needs to set the height field value to 0.
     */
    public Cuboid(final double argWidth, final double argLength, final double argHeight) {
        super(argWidth, argLength);
    
    if (argHeight < 0) {
        this.height = 0;
    }
    else
    this.height = argHeight;
    }
    /**
     * Method named getHeight without any parameters, it needs to return the value of height field.
     * @return
     */
    public double getHeight() {
        return height;
    }
    /**
     * Method named getVolume without any parameters, it needs to return the calculated volume. 
     * To calculate volume multiply the area with height.
     * @return
     */
    public double getVolume() {
        return getArea() * height;
    }
}
