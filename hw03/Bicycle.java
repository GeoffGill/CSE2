//Geoff Gill
//CSE02
//hw03
import java.util.Scanner;

public class Bicycle {
    			  // main method required for every Java program
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print(
   	        "Enter the number of seconds: ");
   	    
   	    int nSeconds = myScanner.nextInt();
   	    System.out.print("Enter the number of counts:  " );
        int nCounts = myScanner.nextInt();
        double dTraveled = nCounts*(27*3.14)/12/5280*100;
        double speed = dTraveled/nSeconds*360*10;
        
        //Adjusted to print too two digits
        
        int iDTraveled = (int) dTraveled;
        int iSpeed = (int) speed;
        double finDTraveled = iDTraveled/100.00;
        
        System.out.println("The distance traveled was " + finDTraveled);
        System.out.println("The average speed was " + iSpeed/100.0);
        
    }  //end of main method   
} //end of class