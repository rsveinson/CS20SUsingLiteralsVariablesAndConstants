/*******************************
 * Name: R Sveinson
 * Class: CS20S
 * 
 * Assignment: Using format template
 * 
 * Description: example of how to use the template
 *              to organize Java code
 *********************************/
// *** import libraries ***
import java.util.Scanner;

public class CS20SUsingTheTemplate
{
    public static void main(String[] args){
    // *** constants ***
    
    // *** variables ***
    
        String banner = "";     // output banner
        String strin = "";      // input string
        String strout = "";     // output string
        
        // user input
        String name = "";
        
        // numbers to be averaged
        int number1 = 0;
        int number2 = 0;
        
        // calculated
        double average = 0.0;    // the average of two numbers
    
    // *** objects ***
    
        // to get input from the keyboard
        Scanner scanner = new Scanner(System.in);
    
    // *** banner ***
    
        banner = "*************************\n";
        banner += "Name: R Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Using the Template\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** input ***
    
        // prompt user for information
        System.out.println("enter your name and two numbers.");
        
        // read in data from the keyboard buffer
        name = scanner.next();      // read the first token as a string
        number1 = scanner.nextInt();    // read the next token as an int
        number2 = scanner.nextInt();    // read the last token as an int
        
        // echo input back to the terminal window
        System.out.println("You entered: " + name + ", " + number1 + ", " + number2);
    
    // *** processing ***
    
        average = (number1 + number2) / 2.0;      // get the average
    
    // *** output ***
    
        // headings
        System.out.println();   // blank line
        System.out.println("Calculation result");
        System.out.println();
        
        System.out.print("The average of: ");
        System.out.print(number1 + " and " + number2);
        System.out.println(" is = " + average);
    
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
