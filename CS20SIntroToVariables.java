/*******************************
 * Name: R Sveinson
 * Class: CS20S
 * 
 * Assignment: Intro to Variables and literals
 * 
 * Description: an example of using variables, constants
 *              literals, and also intro to data types
 *********************************/
// *** import libraries ***
import java.util.Scanner;

public class CS20SIntroToVariables
{
    public static void main(String[] args){
    // *** constants ***
    
    // *** variables ***
    
        String banner = "";     // output banner
        String strin = "";      // input string
        String strout = "";     // output string
        
        // two variables to hold superheor names
        String superHero1 = "Batman";
        String superHero2 = "Robin";
        
        // two integers to use in simple math
        int number1 = 5;
        int number2 = 17;
        int sum = 0;        // the sum of 2 ints
        
        // two doubles for simple math
        double floatingNumber1 = 2.5;
        double floatingNumber2 = 5.0;
        double doubleSum = 0.0;
    
    // *** objects ***
    
        // to get input from the keyboard
        //Scanner scanner = new Scanner(System.in);
    
    // *** banner ***
    
        banner = "*************************\n";
        banner += "Name: R Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Intro to Variables\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** input ***
    
        // prompt user for information
        // read in data from the keyboard buffer
        // echo input back to the terminal window
    
    // *** processing ***
    
        sum = number1 + number2;                        // add two ints
        doubleSum = floatingNumber1 + floatingNumber2;  // add two doubles
        
        // oops this won't work, why not?
        //number1 = floatingNumber1 - number2;
        
    // *** output ***
    
        //System.out.println("Batman and Robin");
        System.out.println(superHero1 + " and " + superHero2);
        
        superHero1 = "Flash";
        superHero2 = "Dangerman";
        System.out.println(superHero1 + " and " + superHero2);
        
        // output some integers
        //System.out.println(5 + " + " + 7 + " = " + (5 + 7));
        //System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " + " + number2 + " = " + sum);  
        
        // output some doubles
        System.out.print(floatingNumber1 + " + ");
        System.out.print(floatingNumber2 + " = ");
        System.out.println(doubleSum);
        
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
