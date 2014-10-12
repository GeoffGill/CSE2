/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
    public static void main(String []arg){
        double percent;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        double x=scan.nextDouble();
        if((x>=0)&&(x<100)){
            System.out.println("You entered "+x+"%");
            double remainder = (1-x/100);
            //print out the proportion remaining for select percentages
            System.out.println("The proportion remaining is "+ remainder);
        }
        else{
            System.out.println("You did not enter a valid input");
        }
    }
}   

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *      The code currectly only works for inputs 7,41,14,33,60 and not all inputs 1-99
 *      It also does not test to see if the input is valid, and if invalid doesnt print out a message 
 *          saying so
 *      There also was no scanner defined
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *      I defined a scanner
 *      I also defined a variable remander and print out that variable dependant on the input
 *      I included an if statment to limit values 0-99, and a print out if the value isnt in that range
 * 
 */
