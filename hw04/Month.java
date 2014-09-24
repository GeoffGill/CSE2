//Geoff Gill
//CSE02
//hw04
import java.util.Scanner;

public class Month {
    			  // calculates the tax bracket percentage and the dollar amount
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter an int giving the number of the month (1-12) - ");
   	    int month = myScanner.nextInt();
   	    int daysOfMonth;
   	    //days per month for all 12 months
   	    if (month == 1){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }
   	    
   	    if (month ==2){
   	        System.out.print("Enter the year: ");
   	        int year = myScanner.nextInt();
   	        //calculatiosn to detemine leap year
   	        if ((year % 4) == 0) {  //checks if year is divisible by 4
   	            System.out.println("The month has 29 days");
   	        }
   	        
   	        else {
   	            System.out.println("The month has 28 days");
   	            
   	        }
   	    }
        //calculations for the rest of the months
   	    if (month == 3){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 4){
   	        daysOfMonth = 30;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 5){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 6){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 7){
   	        daysOfMonth = 30;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 8){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 9){
   	        daysOfMonth = 30;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 10){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 11){
   	        daysOfMonth = 30;
   	        System.out.println("The month has " + daysOfMonth);
   	    }if (month == 12){
   	        daysOfMonth = 31;
   	        System.out.println("The month has " + daysOfMonth);
   	    }
        
   	        
   	}
}