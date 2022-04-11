package Section7.Polymorphism;
/**
 * For this exercise you will create four classes of vehicles. The first class should be named Car.
 * This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
 * The first class contains four member variables, or fields, with these names and conditions:
engine of type boolean
cylinders of type int
name of type String
wheels of type int
All four member variables should have private access.
 */
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
/**
 * The constructor should accept two parameters, cylinders and name. 
 * Also, all of these cars have an engine and four wheels. 
 * So the other two fields should be set to default values.
 */
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    /**
     * startEngine accepts no parameters and returns a message which says that the car's engine is starting.
     */
    public String startEngine() {
        return "Car -> startEngine()";
    }
    /**
     * accelerate accepts no parameters and returns a message that says the car is accelerating.
     */
    public String accelerate() {
        return "Car -> accelerate()";
    }
    /**
     * brake accepts no parameters and returns a message stating the car is braking.
     */
    public String brake() {
        return "Car -> brake()";
    }
    /**
     * Two getter methods should also be defined here for the member variables cylinders and name. 
     * All methods have public access.
     * @return
     */
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
}
/**
 * The other three classes mentioned above are sub-classes of Car.
 * These classes have no member variables and the constructor for each will call the parent constructor
 * for object instantiation.
 * Each of these classes will override the three parent methods startEngine, accelerate, and brake.
 * The return messages for these methods should somewhere contain the name of the class to which the methods belong.
 */