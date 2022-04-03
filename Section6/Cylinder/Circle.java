package Section6.Cylinder;
/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
 */
public class Circle {
    private double radius;
    /**
     * The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
     * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
     * @param argRadius
     */
    public Circle(final double argRadius) {
        if( argRadius > 0)
        this.radius = argRadius;
        else
            this.radius = 0;
    }
    /**
     * Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
     * @return
     */
    public double getRadius() {
        return radius;
    }
    /**
     * 
     * radius sets radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Method named getRadius without any parameters, it needs to return the value of radius field.
     * @return Area
     */
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }


}
