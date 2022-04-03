package Section6;
/**
 * Write a class with the name Wall. 
 * The class needs two fields (instance variables) with name width and height of type double.
 */
public class Wall {
    private double width;
    private double height;
/**
 * The class needs to have two constructors. 
 * The first constructor does not have any parameters (no-arg constructor). 
 */
    public Wall() {
    }
/**
 * The second constructor has parameters width and height of type double and it needs to initialize the fields.
 * In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is
 * less than 0 it needs to set the height field value to 0.
 * @param argWidth
 * @param argHeight
 */
    public Wall(final double argWidth, final double argHeight) {
        this.width = argWidth < 0 ? 0 : argWidth;
        this.height = argHeight < 0 ? 0 : argHeight;
    }
/**
 * Method named getWidth without any parameters, it needs to return the value of width field.
 */
    public double getWidth() {
        return width;
    }
/**
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field. 
 * If the parameter is less than 0 it needs to set the width field value to 0.
 * @param width
 */
    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
        this.width = width;
    }
/**
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * @return height
 */
    public double getHeight() {
        return height;
    }
/**
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field. 
 * If the parameter is less than 0 it needs to set the height field value to 0.
 * @param height
 */
    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
        this.height = height;
    }
/**
 * Method named getArea without any parameters, it needs to return the area of the wall.
 * @return area
 */
    public double getArea() {
        return width * height;
    }
}
