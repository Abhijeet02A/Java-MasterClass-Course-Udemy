package Section6;

/**
 * Write a class with the name Calculator. 
 * The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 */
public class Calculator {
    private Floor floor;
    private Carpet carpet;
/**
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
 * it needs to initialize the fields.
 * @param floor
 * @param carpet
 */
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
/**
 * Method named getTotalCost without any parameters, 
 * it needs to return the calculated total cost to cover the floor with a carpet.
 */
    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
