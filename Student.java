/**
 * An object holding the student number, grade, school, mark, happiness level,
 * passion level, and wether they were accepted to University or not of a
 * student
 * 
 * @author Michael Chang
 * @since JDK 17
 * @version 1.0
 * 
 */
public class Student extends People {

    private String school;
    private boolean uniAccepted;
    private int studentNumber;
    private int grade;
    private int mark;
    private int studentHappinessLevel = 50;
    private int studentPassionLevel = 0;

    /**
     * This is the constructor function for new students
     * 
     * @param fullName      - This is the full name of the student
     * @param age           - This is the age of the student
     * @param height        - This is the height of the student
     * @param dateOfBirth   - This is the date of birth of the student
     * @param studentNumber - This is the student number of the student
     * @param grade         - This is the grade of the student
     * @param school        - This is the school of the student
     * @param mark          - This is the mark of the student
     * @param uniAccepted   - This is if the student got accepted to University or
     *                      not
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
     * Returns the mark of the student
     * 
     * @returns the mark of the student as an Integer
     */
    public int getMark() {
        return mark;
    }

    /**
     * Returns the happiness level of the student
     * 
     * @returns the happiness level of the student as an Integer
     */
    public int getHappinessLevel() {
        return studentHappinessLevel;
    }

    /**
     * Sets university to accepted
     * 
     * @param uniAccepted - This is to set the student uni to accepted
     */
    public void setUniAccepted(boolean uniAccepted) {
        this.uniAccepted = uniAccepted;
    }

    /**
     * Shows the portfolio of the student
     * 
     * @returns the portfolio of the student as a String
     */
    public String getStudentPortfolio() {
        return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Student Number: " +
                studentNumber + "|Grade: " + grade + "|School: " + school + "|Marks: " + mark;
    }

    /**
     * Attempts to show the student's university application
     * 
     * @returns the university application of the student if applicable as a String
     */
    public String universityApplication() {
        if (grade >= 12) {
            return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Passion Level: " +
                    studentPassionLevel + "|Grade: " + grade + "|Marks: " + mark;
        } else {
            return "Not applicable";
        }
    }

    /**
     * Calculator that puts the number one after the other for the student
     * 
     * @param a - This is the first number in the student's number creator
     *          calculator
     * @param b - This is the second number in the student's number creator
     *          calculator
     * @param c - This is the third number in the student's number creator
     *          calculator
     * @returns the numbers one after the other as a String
     */
    public String numberCreator(int a, int b, int c) {
        String tempA = Integer.toString(a);
        String tempB = Integer.toString(b);
        String tempC = Integer.toString(c);
        return tempA + tempB + tempC;
    }

    /**
     * Calculator that removes the decimal for the student
     * 
     * @param a - This is the first number in the student's deciaml remover
     *          calculator
     * @param b - This is the second number in the student's deciaml remover
     *          calculator
     * @param c - This is the third number in the student's deciaml remover
     *          calculator
     * @returns the no decimal version of the sum of all numbers as an Integer
     */
    public int decimalRemover(double a, double b, double c) {
        return (int) (a + b + c);
    }

    /**
     * Calculator that gets the sum for the student
     * 
     * @param a - This is the first number in the student's sum calculator
     * @param b - This is the second number in the student's sum calculator
     * @param c - This is the third number in the student's sum calculator
     * @returns the sum of all numbers as a Double
     */
    public double sumCalculator(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Attempts to increase the mark of the student
     * 
     * @param receivedMark - This is the amount to increase the mark of the student
     */
    public void receiveMarks(int receivedMark) {
        if (mark + receivedMark <= 100) {
            mark += receivedMark;
        } else if (mark + receivedMark >= 100) {
            mark = 100;
        } else if (mark + receivedMark <= 0) {
            mark = 0;
        }
    }

    /**
     * Calculates the modified happiness level for the student
     * 
     * @returns the happiness level of the student as an Integer
     */
    public int happinessLevel() {
        if (studentHappinessLevel <= 100 && mark >= 80) {
            studentHappinessLevel += 10;
        } else if (studentHappinessLevel >= 0 && mark < 50) {
            studentHappinessLevel -= 10;
        }
        if (uniAccepted && studentHappinessLevel + 20 <= 100) {
            studentHappinessLevel += 20;
        } else if (!uniAccepted && studentHappinessLevel - 20 >= 0) {
            studentHappinessLevel -= 20;
        }
        return studentHappinessLevel;
    }

}