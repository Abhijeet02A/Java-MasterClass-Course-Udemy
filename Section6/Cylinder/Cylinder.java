package Section6.Cylinder;
/**
 * Write a class with the name Cylinder that extends Circle class.
 
 */
public class Cylinder extends Circle{
    /**
     * The class needs one field (instance variable) with name height of type double.
     */
    private double height;
    /**
     * The class needs to have one constructor with two parameters radius and height both of type double.
     * It needs to call parent constructor and initialize a height field.
     * In case the height parameter is less than 0 it needs to set the height field value to 0.
     */
    public Cylinder(final double argRadius ,final double argHeight) {
        super(argRadius);
        if(argHeight > 0) {
            this.height = argHeight;
        }
        else 
            this.height = 0;
    }
    /**
     * Method named getHeight without any parameters, it needs to return the value of height field.
     * @return height
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
