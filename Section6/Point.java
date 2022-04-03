package Section6;

/**
 * You have to represent a point in 2D space.
 * Write a class with the name Point. 
 * The class needs two fields (instance variables) with name x and y of type int.
 */
public class Point {
    private int x;
    private int y;
/**
 * The class needs to have two constructors. 
 * The first constructor does not have any parameters (no-arg constructor).
 */
    public Point(){

    }
/**
 *  The second constructor has parameters x and y of type int and it needs to initialize the fields.
 * @param x
 * @param y
 */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
/**
 * Method named getX without any parameters, it needs to return the value of x field.
 * @return x
 */
    public int getX() {
        return x;
    }
/**
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * @param x
 */
    public void setX(int x) {
        this.x = x;
    }
/**
 * Method named getY without any parameters, it needs to return the value of y field.
 * @return y
 */
    public int getY() {
        return y;
    }
/**
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * @param y
 */
    public void setY(int y) {
        this.y = y;
    }
/**
 * Method named distance without any parameters, 
 * it needs to return the distance between this Point and Point 0,0 as double.
 */
    public double distance() {
        return Math.sqrt ((this.x- 0.0) * (this.x- 0.0) + (this.y - 0.0) * (this.y - 0.0));
    }
/**
 * Method named distance with two parameters x, y both of type int, 
 * it needs to return the distance between this Point and Point x,y as double.
 * @param x
 * @param y
 * @return
 */
    public double distance(final int x, final int y) {
        return Math.sqrt((this.x - x)* (this.x-x) + (this.y - y)*(this.y-y));

    }
/**
 * Method named distance with parameter another of type Point, 
 * it needs to return the distance between this Point and another Point as double.
 * @param a
 * @return
 */
    public double distance(final Point a) {
        return Math.sqrt((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y));
    }
}
