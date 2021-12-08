import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    String line = "";

    try {
        BufferedReader br = new BufferedReader(new FileReader("STEM_Salaries.csv"));
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    try {
        PrintWriter writer = new PrintWriter("Job_Search_Results.txt");
        writer.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        
    
    

     

       
    }

    /* 
     * Sources:
     * https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html
     * https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/
     */
}
