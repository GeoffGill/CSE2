//Geoff Gill
//CSE02
//hw04
import java.util.Scanner;

public class TimePadding {
    			  // calculates the tax bracket percentage and the dollar amount
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter the time is seconds: " );
   	    int input = myScanner.nextInt();
   	    int hours = input/3600;                 //hours
   	    int inputAdj = input - hours*3600;      //seconds afer hours subtracted
   	    int mins = inputAdj/60;                 //mins
   	    int secs = inputAdj-mins*60;            //secs
   	        if (mins<10 &&secs<10){
   	            System.out.println("The time is "+hours+":0"+mins+":0"+secs+".");   //for when you need a zero printed before both mins and secs
   	        }
   	        else if (mins<10&&secs>9){
   	            System.out.println("The time is "+hours+":0"+mins+":"+secs+".");    //for when you need a zero printed before mins only
   	        }
   	        else if (mins>9&&secs<10){
   	            System.out.println("The time is "+hours+":"+mins+":0"+secs+".");    //for when you need a zero printed before seconds only
   	        }
   	        else if(mins>9&&secs>9){
   	            System.out.println("The time is "+hours+":"+mins+":"+secs+".");     //for when you do not need an filler zeros
   	        }
   	}
}