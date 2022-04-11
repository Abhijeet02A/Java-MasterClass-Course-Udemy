package Section7.Polymorphism;

public class Ford extends Car {
    public Ford(final int cylinders, final String name) {
        super(cylinders, name);
    }
    @Override
    /**
     * startEngine accepts no parameters and returns a message which says that the car's engine is starting.
     */
    public String startEngine() {
        return "Ford -> startEngine()";
    }
    /**
     * accelerate accepts no parameters and returns a message that says the car is accelerating.
     */
    public String accelerate() {
        return "Ford -> accelerate()";
    }
    /**
     * brake accepts no parameters and returns a message stating the car is braking.
     */
    public String brake() {
        return "Ford -> brake()";
    }
}
