package Section7.Encapsulation;
/**
 * Create a class named Printer, giving it two variables of type int: 
 * tonerLevel and pagesPrinted, and one type boolean named duplex. 
 * All three fields will have private access. The associated constructor will accept two of these variables:
 * tonerLevel and duplex, and will have rules:
 * tonerLevel must be greater than -1 but less than or equal to 100.
 *  If it does not meet these condition, then is should be initialized to -1.
 * duplex should be initialized to the value of the parameter.
 * In addition, pagesPrinted should be initialized to 0.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(final int tonerLevel, final boolean duplex) {
        if (tonerLevel < 0 && tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
/**
 * addToner will accept one parameter, tonerAmount, type int. 
 * First, tonerAmount should be greater than 0 and less than or equal to 100.
 * If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount 
 * is greater than 100. If so, the method should return -1. 
 * If not, then tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should
 * then be returned by the method. Also if the initial condition test fails,
 * then the method should return -1.
 */
    public int addToner(final int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + this.tonerLevel > 100) {
                return -1;
            } else {
               this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
        return this.tonerLevel;
    }

/**
 * Method printPages will accept one parameter, pages of type int. 
 * A variable called pagesToPrint should be created and initialized to the value of the incoming parameter. 
 * A conditional check should be performed on whether the Printer class field duplex is “true” or “false”. 
 * If “true” then a calculation most be performed to determine the number of pages (sheets of paper) needed 
 * to print the job double sided. The pagesToPrint value is then added to the class field pagesPrinted, 
 * but the value of pagesToPrint should be returned by the method.
 */
public int printPages(int pages) {
    int pagesToPrint = pages;
    if (duplex) {
        pagesToPrint = pages / 2 + pages % 2;
    } 

    pagesPrinted += pagesToPrint;
    return pagesToPrint;
}

/**
 * Method getPagesPrinted has no parameters and merely returns the values of the member variable 
 * pagesPrinted.
 */
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
/**
 * 
 */