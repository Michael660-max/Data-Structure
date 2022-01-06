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
    private int salary;
    private int employeePassionLevel = 0;
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
    public Employee(String fullName, int age, double height, String dateOfBirth, String job, int salary,
            int employeePassionLevel) {
        super(fullName, age, height, dateOfBirth);
        this.job = job;
        this.salary = salary;
        this.employeePassionLevel = employeeHappinessLevel;
    }

    /**
     * set passion level of the employee
     * 
     * @param increaseEmployeePassionLevel - This is what to set the passion level of the employee
     */
    public void setEmployeePassionLevel(int increaseEmployeePassionLevel) {
        employeePassionLevel += increaseEmployeePassionLevel;
    }

    /**
     * set salary level of the employee
     * 
     * @param salary - This is what to set the salary of the employee
     */
    public void setEmployeeSalaryLevel(int salary) {
        this.salary = salary;
    }

    /**
     * set job of the employee
     * 
     * @param job - This is what to set the job to of the employee
     */
    public void setEmployeeJob(String job) {
        this.job = job;
    }

    /**
     * Shows portfolio of the employee
     * 
     * @returns the portfolio of the employee as a String
     */
    public String getEmployeePortfolio() {
        return "Name: " + fullName + "|Date of Birth: " + dateOfBirth + "|Job: " + job + "|Salary: " + salary;
    }

    /**
     * Shows happiness level of the employee
     * 
     * @returns the happiness level of the employee as an Integer
     */
    public int getHappinessLevel() {
        return employeeHappinessLevel;
    }

    /**
     * Calculates happiness level of the employee
     * 
     * @returns the new happiness level of the employee as an Integer
     */
    public int happinessLevel() {
        if (employeeHappinessLevel <= 100 && salary >= 100000) {
            employeeHappinessLevel += 10;
        } else if (salary <= 100000) {
            employeeHappinessLevel -= 10;
        }

        if (employeeHappinessLevel <= 100 && employeePassionLevel > 50) {
            employeeHappinessLevel += 10;
        } else if (employeeHappinessLevel <= 100 && employeePassionLevel >= 70) {
            employeeHappinessLevel += 15;
        } else if (employeeHappinessLevel <= 100 && employeePassionLevel >= 90) {
            employeeHappinessLevel += 25;
        }

        if (job == "Unemployed") {
            employeeHappinessLevel -= 10;
        } else {
            employeeHappinessLevel += 10;
        }

        return employeeHappinessLevel;
    }

}