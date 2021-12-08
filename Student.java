/**
 * An object holding the student number, grade, school, mark, and happiness and passion level of a student
 * 
 * @author Michael Chang
 * @since JDK 17
 * @version 1.0
 * 
 */
public class Student extends People {

    private String school;
    private int studentNumber;
    private int grade;
    private int mark;
    private int studentHappinessLevel = 50;
    private int studentPassionLevel = 50;
    private boolean uniAccepted;

    /**
     * This is the constructor function for new students
     * 
     * @param fullName - This is the full name of the student
     * @param age - This is the age of the student
     * @param height - This is the height of the student
     * @param dateOfBirth - This is the date of birth of the student
     * @param studentNumber - This is the student number of the student
     * @param grade - This is the grade of the student
     * @param school - This is the school of the student
     * @param mark - This is the mark of the student
     * 
     */
    public Student(String fullName, int age, double height, String dateOfBirth, int studentNumber, int grade,
            String school, int mark, boolean uniAccepted) {
        super(fullName, age, height, dateOfBirth);
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.school = school;
        this.mark = mark;
        this.uniAccepted = uniAccepted;
    }

     /**
     * Shows the student's grades
     */
    public int getGrades() {
        return grade;
    }

    public void setUniAccepted () {
        uniAccepted = true;
    }

    /**
     * Shows the student's portfolio
     */
    public String getStudentPortfolio() {
        return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Student Number: " + 
        studentNumber + "|Grade: " + grade + "|School: " + school  + "|Marks: " + mark;
    }

    /**
     * Shows student's university application
     */
    public String universityApplication() {
        if (grade >= 12) {
            return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Passion Level: " + 
            studentPassionLevel + "|Grade: " + grade + "|Marks: " + mark;   
        }
            return "Not applicable";
    }

    /**
     * Puts the numbers one after the other
     * 
     * @param a - This is the first number in the student's number creator 
     * @param b - This is the second number in the number creator
     * @param c - This is the third number in the number creator
     * @returns the numbers one after the other 
     */
    public String numberCreator (int a, int b, int c) {
        String tempA = Integer.toString(a);
        String tempB = Integer.toString(b);
        String tempC = Integer.toString(c);
        return tempA + tempB + tempC;
    }

     /**
     * Calculates the rounded sum of 3 numbers
     * 
     * @param a - This is the first number in the student's rounding calculator
     * @param b - This is the second number in the rounding calculator
     * @param c - This is the third number in the rounding calculator
     * @returns the rounded version of the sum of all numbers
     */
    public int decimalRemover(double a, double b, double c) {
        return(int)(a + b + c);
    }

     /**
     * Calculates the decimal sum of 3 words
     * 
     * @param a - This is the first words in the student's sum calculator
     * @param b - This is the second words in the sum calculator
     * @param c - This is the third words in the sum calculator
     * @returns the deciaml versions of all the words adding up
     */
    public double sumCalculator(String a, String b, String c) {
        double tempA = Double.valueOf(a);
        double tempB = Double.valueOf(b);
        double tempC = Double.valueOf(c);
        return(double)(tempA + tempB + tempC);
    }

     /**
     * Calculates the modified mark of the student
     * 
     * @param a - This is the mark of the student
     * @returns the updated mark of the student
     */
    public void receiveMarks(int receivedMark) {
        mark += receivedMark;
    }

     /**
     * Calculates the modified happiness level of the student
     * 
     * @param a - This is the first number in the number creator
     * @param b - This is the second number in the number creator
     * @param c - This is the third number in the number creator
     * @returns the happiness level of the student 
     */
    public int happinessLevel() {
        if (studentHappinessLevel <= 100 && mark >= 80) {
            studentHappinessLevel += 10;
        } else if (studentHappinessLevel >= 0 && mark < 50) {
            studentHappinessLevel -= 10;
        }
        if (uniAccepted && studentHappinessLevel <= 100) {
            studentHappinessLevel += 20;
        }
        return studentHappinessLevel;
    }

}