package Section6;

/**
 * A complex number is a number that can be expressed in the form a + bi, 
 * where a and b are real numbers, and i is a solution of the equation x2 = −1. 
 * Because no real number satisfies this equation, i is called an imaginary number. 
 * For the complex number a + bi, a is called the real part, and b is called the imaginary part. 
 * To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. 
 * For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
 */
/**
 * Write a class with the name ComplexNumber. The class needs two fields (instance variables)
 *  with name real and imaginary of type double. It represents the Complex Number.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;
/**
 * The class needs to have one constructor. 
 * The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
 * @param real
 * @param imaginary
 */
    public ComplexNumber(final double real,final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
/**
 * Method named getReal without any parameters, it needs to return the value of real field.
 * @return
 */
    public double getReal() {
        return real;
    }

/**
 * Method named getImaginary without any parameters, it needs to return the value of imaginary field.
 * @return
 */
    public double getImaginary() {
        return this.imaginary;
    }
/**
 * Method named add with two parameters real and imaginary of type double, 
 * it needs to add parameters to fields. In other words, 
 * it needs to do a complex number add operation as described above.
 */
    public void add(final double real, final double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }
/**
 * Method named add with one parameter of type ComplexNumber. 
 * It needs to add the ComplexNumber parameter to the corresponding instance variables.
 */
    public void add(final ComplexNumber complexNumber) {
        this.real = this.real + complexNumber.real;
        this.imaginary = this.imaginary + complexNumber.imaginary;
    }
/**
 * Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, 
 * in other words, it needs to do a complex number subtract operation as described above.
 */
    public void subtract(final double real, final double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
/**
 * Method named subtract with one parameter other of type ComplexNumber. 
 * It needs to subtract the other parameter from this complex number.
 */
    public void subtract(final ComplexNumber complexNumber) {
        this.real = this.real - complexNumber.getReal();
        this.imaginary = this.imaginary - complexNumber.getImaginary();
    }
}
