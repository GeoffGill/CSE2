//Geoff Gill
//hw06.2
//10/14/14
//This program calculates the square root of a number greater than zero
//to a tolerance euqal to .0000001*x where x is your input

import java.util.Scanner;

public class Root{
     public static void main (String[] args) {
         //prompts user for input
         System.out.println("Please enter a number greater than zero");
        Scanner myScanner = new Scanner (System.in);        //defines scanner
        //sets variables
        double input = myScanner.nextDouble();      //your number
        double low=0;                               //low value
        double high=(input+1);                      //high value
        double medium=0;                            //initialize medium(changed later)
        double tolerance = high-low;                //changing tolerance variable
        //Output if the number was invalid
        if(input<=0){
            System.out.println("The input was less than zero");
        }
        //logic if a valid number entered
        else{
            while(tolerance>(.0000001*input)){      //tests to see if tolerance needs to be lower and testing continued
                 medium = ((low+high)/2);           //defines medium
                if((medium*medium)>input){          //tests if low or high needs to be changed
                    high = medium;
                }
                else{
                    low = medium;
                }
                tolerance = (high-low);             //redefines tolerance
            }
            //prints out the estimated square root
            System.out.println("The square root of "+input+" is equal to "+medium);
        }
     }
}
