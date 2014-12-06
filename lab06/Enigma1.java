/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    Scanner scan = new Scanner( System.in);
    
    System.out.print("Enter a value for the percent (0, 1,...99) ");
    double percent = scan.hasNextInt() ? scan.nextInt() : -1;
    double x = percent / 100;
    
    if(percent <= 0 || percent >= 100)System.out.println("Not a proper integer or not an integer...");
    
    System.out.println("You entered " + percent + "%");//print out the proportion remaining for select percentages
         if(1-percent/100==0.93)System.out.println("The proportion remaining is "+0.93);   //when the user enters 7 
    else if(1-percent/100==0.59)System.out.println("The proportion remaining is "+0.59);//when the user enters 41
    else if(1-percent/100==0.86)System.out.println("The proportion remaining is "+0.86);//when the user enters 14
    else if(1-percent/100==0.67)System.out.println("The proportion remaining is "+0.67);//when the user enters 33
    else if(1-percent/100==0.40)System.out.println("The proportion remaining is "+0.40);//when the user enters 60
   }
}

/* Error report: 
 *  fixed input, made sure it's within the boundaries
 *  fixed output, made sure it's correct
 *  
 *  this program doesn't work when the input is not correct or when it's not a 
 *  7, 41, 14, 33 or 66
 *  
 *  
 *  
 */