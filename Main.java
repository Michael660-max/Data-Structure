import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    // //Student
    Scanner sc = new Scanner(System.in);
    // Random rand = new Random(); 
    // Student student = new Student("Jeffery Smith", 17, 170.5, "April 3, 2004", 625029, 12, "Seal Gulch Secondary School", rand.nextInt(100), false);

    // System.out.println("***|Day in a Life Simulator|***"
    //  + "\nWe will see a student and an employee's day to day life"
    //  + "\nand showcase their happiness levels as they progress throughout the day\n");
    
    //  //Exam Instructions
    // System.out.println("***|Exam day for Jeffery Smith [STUDENT]|***"
    // + "\nHe must choose the correct calculator for each question" 
    // + "\nEach number corresponds to a calculator: "
    // + "\n   [1] Decimal Removing Calculator"
    // + "\n   [2] Sum Calculator"
    // + "\n   [3] Number Placer Calculator\n"

    // //Question 1
    // + "\n[Question 1]  Place 3 numbers next to eachother using 50 25 15"
    // + "\nInput a number from 1 - 3 to choose the calculator for the question: ");
    // int input1 = sc.nextInt();
    // int markBonus = 0;
    // if (input1 == 3) {
    //     System.out.println("Correct Calculator!!");
    //     System.out.println("Answer to Question: " + student.numberCreator(50, 25, 15));
    //     markBonus += 5;
    // } else {
    //     System.out.println("Wrong Calculator!!");
    //     markBonus -= 5;
    // }

    // //Question 2
    // System.out.println("[Question 2] Remove the decimal when adding 80.5 25.2 35.9"
    // + "\nInput a number from 1 - 3 to choose the calculator for the question: \n");
    // int input2 = sc.nextInt();
    // if (input2 == 1) {
    //     System.out.println("Correct Calculator!!");
    //     System.out.println("Answer to Question: " + student.decimalRemover(80.5, 25.2, 35.9));
    //     markBonus += 5;
    //     System.out.println("Mark bonus: " + markBonus);
    // } else {
    //     System.out.println("Wrong Calculator!!");
    //     markBonus -= 5;
    //     System.out.println("Mark bonus: " + markBonus);
    // }

    // //Question 3
    // System.out.println("[Question 3] Add numbers together using 15.1 25.2 10.3"
    // + "\nInput a number from 1 - 3 to choose the calculator for the question: \n");
    // int input3 = sc.nextInt();
    // if (input3 == 2) {
    //     System.out.println("Correct Calculator!!");
    //     System.out.println("Answer to Question: " + student.sumCalculator("15.1", "25.2", "10.3"));
    //     markBonus += 5;
    //     System.out.println("Mark bonus: " + markBonus);
    // } else {
    //     System.out.println("Wrong Calculator!!");
    //     markBonus -= 5;
    //     System.out.println("Mark bonus: " + markBonus);
    // }

    // //Student Portfolio
    // System.out.println("\nJeffery checks his student portfolio after the exam"
    // + "\nBefore Exam: ");
    // System.out.print("Student portfolio: " + student.getStudentPortfolio() + "\n");

    // //New student portfolio after receiving marks
    // student.receiveMarks(markBonus);
    // System.out.print("\nAfter Exam: ");
    // System.out.println("Student portfolio: " + student.getStudentPortfolio() + "\n");

    // //University applications and checking happiness levels
    // int markReq = rand.nextInt(100);
    // System.out.println("Jeffery submits his University application with his updated marks:" 
    // + "\nUniversity Application: " + student.universityApplication()
    // + "\nHe needs a mark greater than " + markReq + "to be admitted");
    // if (student.getGrades() >= markReq) {
    //     student.setUniAccepted();
    //     System.out.println("He was admitted!!");
    // } else {
    //     System.out.println("He did not get admitted ): ");
    // }
    // System.out.println("\nHappiness level at the end of the day: " + student.happinessLevel());

    // //Employee
    // Employee employee = new Employee("Robert Lopez", 24, 180.5, "November 14, 1997", "Unemployed", 0.0, 50);
    // System.out.println("***|Robert's first job [Employee]|***");

    //Reading from file
    ArrayList<String> list = new ArrayList<>();
    String line = "";
    String header = "";
    try {
        BufferedReader br = new BufferedReader(new FileReader("STEM_Salaries.csv"));
        header = br.readLine();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Writing to file
    try {
        PrintWriter writer = new PrintWriter("Job_Search_Results.txt");
        System.out.println("Robert majored in computer science so he searches jobs that involve cs: "
        + "\nE.g: Inputting 'Product Designer' means he will apply to all Product Designer occupations");

        // Searching for job, and writing available jobs and highest paid job to a file
        String job = sc.next();
        int highestPaidJob = Integer.MIN_VALUE;
        int store = 0;

        writer.println("Each column represents: \n"
        + header.replace(",", "|"));   
    
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(job)) {
                writer.println("Job found" + "[" + i + 1 + "]" + ": " + list.get(i).replace(",", "|"));
                String[] temp = list.get(i).split(",");
                if (Integer.parseInt(temp[2]) > highestPaidJob) {
                    store = i;
                }
            }
        }
        writer.println("Highest paid job: " + list.get(store));
        writer.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    sc.close();
       
    }

    /* 
     * Sources:
     * https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html
     * https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/
     */
}
