package Section6;
/**
 * Write a class with the name SimpleCalculator. 
 * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * Write the following methods in it:
 */
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
/**
 * Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
 */
    public double getFirstNumber() {
        return this.firstNumber;
    }
/**
 * Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
 */
    public double getSecondNumber() {
        return this.secondNumber;
    }
/**
 * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 */
    public void setFirstNumber(final double argFirstNumber) {
        this.firstNumber = argFirstNumber;
    }
/**
 * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
 */
    public void setSecondNumber(final double argSetSecondNumber) {
        this.secondNumber = argSetSecondNumber;
    }
/**
 * Method named getAdditionResult without any parameters, 
 * it needs to return the result of adding the field values of firstNumber and secondNumber.
 */
    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }
/**
 * Method named getSubtractionResult without any parameters, 
 * it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
 */
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }
/**
 * Method named getMultiplicationResult without any parameters, 
 * it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 */
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }
/**
 * Method named getDivisionResult without any parameters it needs to 
 * return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 */
    public double getDivisionResult() {
        return (this.secondNumber == 0) ? 0 : this.firstNumber / this.secondNumber;
    }
}
