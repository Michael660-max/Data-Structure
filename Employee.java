/**
 * An object holding the job, salary, passion level, and happiness level of an
 * employee
 * 
 * @author Michael Chang
 * @since JDK 17
 * @version 1.0
 * 
 */
public class Employee extends People {

    private String job;
    private double salary;
    private int employeePassionLevel;
    private int employeeHappinessLevel = 50;

    /**
     * This is the constructor function for new Employees
     * 
     * @param fullName             - This is the full name of the employee
     * @param age                  - This is the age of the employee
     * @param height               - This is the height of the employee
     * @param dateOfBirth          - This is the date of birth of the employee
     * @param job                  - This is the job of the employee
     * @param salary               - This is the salary of the employee
     * @param employeePassionLevel - This is the passion level of the employee
     * 
     */
    public Employee(String fullName, int age, double height, String dateOfBirth, String job, double salary,
            int employeePassionLevel) {
        super(fullName, age, height, dateOfBirth);
        this.job = job;
        this.salary = salary;
        this.employeePassionLevel = employeeHappinessLevel;
    }

    /**
     * Shows employee's portfolio
     */
    public String getEmployeePortfolio() {
        return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Job: " + job + "|Salary: " + salary;
    }

    /**
     * Calculates happiness level
     * 
     * @returns happiness level as an Integer
     */
    public int happinessLevel() {
        if (employeeHappinessLevel <= 100 && salary >= 50000) {
            employeeHappinessLevel += 10;
        }

        if (employeeHappinessLevel <= 100 && employeePassionLevel >= 50) {
            employeeHappinessLevel += 10;
        } else if (employeeHappinessLevel <= 100 && employeePassionLevel >= 70) {
            employeeHappinessLevel += 15;
        } else if (employeeHappinessLevel <= 100 && employeePassionLevel >= 90) {
            employeeHappinessLevel += 25;
        }

        return employeeHappinessLevel;
    }
    
}