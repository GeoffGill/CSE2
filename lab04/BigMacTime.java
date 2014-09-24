

//This program will accept an input (number of big macs ordered, price and tax%)
//and from there will output the total cost

import java.util.Scanner;

public class BigMacTime {
    			  // main method required for every Java program
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print(
   	        "Enter the desired number of Big Macs(must be >0) --> ");
   	    
   	    double nBigMacs = myScanner.nextDouble();
   	    int testVariable = (int) nBigMacs;
   	    double tester = nBigMacs - testVariable;
   	        if ((tester != 0) || (nBigMacs < 0)){
   	            System.out.println("you did not enter a greater than 0 integer");
   	            }

       	else{
            double bigMac$ = 2.22;
    
            double cost$ = nBigMacs*bigMac$;
            System.out.println("The total cost of " +nBigMacs
                +" BigMacs is $ " + cost$);
                
            System.out.println("Do you want an order of fries with that? (Y,y,N,n) : ");
            String answer = myScanner.next();
                if ((answer.equals("Y"))||(answer.equals("y"))){
                    System.out.println("You odered fries at a cost of $2.15'");
                    System.out.println("The total cost of the meal was " + (cost$ + 2.15) );
                }else if ((answer.equals("N"))||(answer.equals("n"))){
                    System.out.println("The total cost of your meal is " + cost$);
                }else{
                    System.out.println("That is a not an accepted answer");
                }
   	    }
    }   	      //end of main method  
        
        


 
} //end of class
