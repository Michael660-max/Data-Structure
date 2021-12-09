/**
 * An object holding the full name, age, height, and date of birth of people
 * 
 * @author Michael Chang
 * @since JDK 17
 * @version 1.0
 * 
 */
public abstract class People {

    protected String fullName;
    protected String dateOfBirth;
    protected int age;
    protected double height;

    /**
     * This is the constructor function for new people
     * 
     * @param fullName    - This is the full name of people
     * @param age         - This is the age of people
     * @param height      - This is the height of people
     * @param dateOfBirth - This is the date of birth of people
     * 
     */
    public People(String fullName, int age, double height, String dateOfBirth) {
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the full name of people
     * 
     * @returns the full name of person as a String
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the happiness level of types of people
     * 
     * @returns the happiness level of types of people as an Integer
     */
    public abstract int happinessLevel();

}