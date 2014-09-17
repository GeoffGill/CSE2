
//Geoff Gill
//CSE02
//hw03import java.util.Scanner;

public class FourDigits {
    			  // main method required for every Java program
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter a number ");
   	    
   	    double number = myScanner.nextDouble();
        double number10000 = number * 10000;
        int iNumber10000 = (int) number10000;
        int iNumber = (int) number;
        int iNum0000 = iNumber * 10000;
        int decNum = iNumber10000 - iNum0000;
        
        System.out.println("The four digits are " + decNum);


   	    
    }  //end of main method   
} //end of class