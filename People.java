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
    protected int age;
    protected double height;
    protected String dateOfBirth;

    /**
     * This is the constructor function for people
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
     * Gets the name of people
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the information of people
     */
    public String getInformation() {
        return "Age: " + age + "|Date of Birth: " + dateOfBirth + "|Height: " + height;
    }

    /**
     * Gets the happiness level of types of people
     */
    public abstract int happinessLevel();

}