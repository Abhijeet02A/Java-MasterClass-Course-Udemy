package Section6;

/**
 * Write a class with the name Person. 
 * The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
/**
 * Method named getFirstName without any parameters, it needs to return the value of the firstName field.
 */
    public String getFirstName() {
        return this.firstName;
    }
/**
 * Method named getLastName without any parameters, it needs to return the value of the lastName field.
 */
    public String getLastName() {
        return this.lastName;
    }
/**
 * Method named getAge without any parameters, it needs to return the value of the age field.
 */
    public int getAge() {
        return this.age;
    }
/**
 * Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
 */
    public void setFirstName(final String argFirstName) {
        this.firstName = argFirstName;
    }
/**
 * Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
 */
    public void setLastName(final String argLastName) {
        this.lastName = argLastName;
    }
/**
 * Method named setAge with one parameter of type int, it needs to set the value of the age field. 
 * If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 */
    public void setAge(final int argAge) {
        if (argAge < 0 || argAge > 100) {
            this.age = 0;
        } else {
            this.age = argAge;
        }
    }
/**
 * Method named isTeen without any parameters, 
 * it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
 */
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }
/**
 * Method named getFullName without any parameters, it needs to return the full name of the person.
 * In case both firstName and lastName fields are empty, Strings return an empty String.
 * In case lastName is an empty String, return firstName.
 * In case firstName is an empty String, return lastName.
 */
    public String getFullName() {
        
            if (this.lastName.isEmpty() && this.firstName.isEmpty()) {
                return this.firstName;
            } else if (this.firstName.isEmpty()) {
                return this.lastName;
            } else if (this.lastName.isEmpty()) {
                return this.firstName;
            }
        return this.firstName + " " + this.lastName;
    }
}
