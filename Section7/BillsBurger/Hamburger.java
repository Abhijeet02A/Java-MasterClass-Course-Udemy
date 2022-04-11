package Section7.BillsBurger;
/**
 * For the base Hamburger class, 
 * there will need to be four variables to represent 
 * the four basic ingredients of the hamburger, name, meat, price, and breadRollType. 
 * The price variable should be of type double, while the other three are of type String. 
 * A constructor will be needed to accept these four values as parameters when creating a new hamburger.
 * 
 * There will also need to be separate variables for four(4) possible additions to the hamburger. 
 * Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, 
 * addition3Name, addition3Price, addition4Name, and addition4Price. 
 * The name variables should be of type String and the price variables should be of type double.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
/**
 * Five(5) methods are also needed inside the Hamburger class. 
 * Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, 
 * if any, and the total price. 
 * Remember that a name and price must be accepted as parameters in the first four methods so that the 
 * price of the hamburger is adjusted accordingly. 
 * These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and 
 * itemizehamburger. 
 * The first four methods do not return values, but the last method does return the total price of the hamburger of type double, 
 * which includes the base price of the hamburger plus any additional items. 
 */
    public void addHamburgerAddition1(String name, double price) {
        addition1Price = price;
        addition1Name = name;
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Price = price;
        addition2Name = name;
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Price = price;
        addition3Name = name;
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Price = price;
        addition4Name = name;
    }
    public double itemizeHamburger() {
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }
}
