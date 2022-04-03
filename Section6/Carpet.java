package Section6;

/**
 * Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
 */
public class Carpet {
    private double cost;
/**
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * @param cost
 */
    public Carpet(final double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }
/**
 * Method named getCost without any parameters, it needs to return the value of cost field
 * @return
 */
    public double getCost() {
        return cost;
    } 
}
